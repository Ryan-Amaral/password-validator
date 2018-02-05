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

    @Test // test whether password is not "password"
    public void testValidator() throws Exception {
        assertEquals(1, vldtr.validate("passwor"));
        assertEquals(1, vldtr.validate("password"));
        assertEquals(2, vldtr.validate("12345678"));
        assertEquals(2, vldtr.validate("passwords"));
    }
}