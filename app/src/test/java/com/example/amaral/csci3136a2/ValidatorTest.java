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
    }

    @Test // test not "password" subroutine
    public void testNotPassword() throws Exception{
        assertEquals(true, vldtr.valNotPassord("9sdhf9sd8hf98sdhf"));
        assertEquals(false, vldtr.valNotPassord("password"));
        assertEquals(false, vldtr.valNotPassord("Password"));
        assertEquals(false, vldtr.valNotPassord("PASSWORD"));
        assertEquals(true, vldtr.valNotPassord("passwords"));
    }

    @Test // test length subroutine
    public void testNotPassword() throws Exception{
        assertEquals(false, vldtr.valLength(""));
        assertEquals(true, vldtr.valLength("password"));
        assertEquals(false, vldtr.valLength("passwor"));
        assertEquals(true, vldtr.valLength("dsuihfv9uhf98hv98dshf98sdhf98sd"));
    }
}