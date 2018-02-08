package com.example.amaral.csci3136a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests validator method.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorTest {

    Validator vldtr = new Validator();

    @Test // test validator as a whole
    public void testValidator() throws Exception {
        assertEquals(1, vldtr.validate("password")); // f not "password" p length
        assertEquals(1, vldtr.validate("passwor")); // p not "password" f length
        assertEquals(2, vldtr.validate("passwords")); // p not "password" p length
        assertEquals(5, vldtr.validate("aA5%&Tidshfs46543"));
        // ... and every combination of passes fails of different tests,
    }

    @Test // test not "password" subroutine
    public void testNotPassword() throws Exception {
        assertEquals(true, vldtr.valNotPassword("9sdhf9sd8hf98sdhf"));
        assertEquals(false, vldtr.valNotPassword("password"));
        assertEquals(false, vldtr.valNotPassword("Password"));
        assertEquals(false, vldtr.valNotPassword("PASSWORD"));
        assertEquals(true, vldtr.valNotPassword("passwords"));
    }

    @Test // test length subroutine
    public void testLength() throws Exception {
        assertEquals(false, vldtr.valLength(""));
        assertEquals(true, vldtr.valLength("password"));
        assertEquals(false, vldtr.valLength("passwor"));
        assertEquals(true, vldtr.valLength("dsuihfv9uhf98hv98dshf98sdhf98sd"));
    }

    @Test // test digit subroutine
    public void testDigit() throws Exception {
        assertEquals(false, vldtr.valDigit("sdkfjslkdjfsda"));
        assertEquals(true, vldtr.valDigit("sdf76876sdfsdf68asd"));
        assertEquals(true, vldtr.valDigit("12345678"));
    }

    @Test // test special char subroutine
    public void testSpecial() throws Exception {
        assertEquals(false, vldtr.valSpecial("dkfljsdalfk"));
        assertEquals(true, vldtr.valSpecial("sdjkf*&^98y"));
    }

    @Test // test both cases subroutine
    public void testBothCase() throws Exception {
        assertEquals(false, vldtr.valBothCase("asef345weafsdf"));
        assertEquals(false, vldtr.valBothCase("SDGSDA345DSFG**"));
        assertEquals(true, vldtr.valBothCase("asdfJKH876jg"));
    }
}