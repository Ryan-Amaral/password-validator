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
        assertEquals(1, vldtr.validate("passwor"));
        assertEquals(1, vldtr.validate("password"));
        assertEquals(2, vldtr.validate("12345678"));
        assertEquals(2, vldtr.validate("passwords"));
    }

    @Test // test not "password" subroutine
    public void testNotPassword() throws Exception{
        assertEquals(true, vldtr.valNotPassord("9sdhf9sd8hf98sdhf"));
        assertEquals(false, vldtr.valNotPassord("password"));
        assertEquals(false, vldtr.valNotPassord("Password"));
        assertEquals(false, vldtr.valNotPassord("PASSWORD"));
        assertEquals(true, vldtr.valNotPassord("passwords"));
    }
}