package com.example.amaral.csci3136a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Validator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final int MAX_SUCCESSES = 3; // amount of tests
    public static final int MIN_LENGTH = 8; // min length of password

    /**
     * Gives the strength of a password based on a number of subroutines.
     * @param pass The password.
     * @return The strength of the password based on how many subroutines it passes. The max
     * possible value is {@value #MAX_SUCCESSES}.
     */
    protected int validate(String pass){
        int successes = 0;
        if(valNotPassword(pass))
                successes++;
        if(valLength(pass))
            successes++;
        return successes;
    }

    /**
     * Whether the password is not equal to "password" or any case-changed variant.
     * @param pass The password.
     * @return Success or failure.
     */
    protected boolean valNotPassword(String pass){
        return !pass.toLowerCase().equals("password");
    }

    /**
     * Whether the password is of appropriate length ({@value #MIN_LENGTH}).
     * @param pass The password.
     * @return Success or failure.
     */
    protected boolean valLength(String pass){
        return pass.length() >= MIN_LENGTH;
    }

    /**
     * Whether the password contains a base-10 digit.
     * @param pass The password.
     * @return Success or failure.
     */
    protected boolean valDigit(String pass){
        //return pass.matches(".*\\d.*");
        return true; // stub
    }

    /**
     * Whether the password contains a special character.
     * @param pass The password.
     * @return Success or failure.
     */
    protected boolean valSpecial(String pass){
        return true; // stub
    }

    /**
     * Whether the password contains upper and lowercase letters.
     * @param pass The password.
     * @return Success or failure.
     */
    protected  boolean valBothCase(String pass){
        return true; // stub
    }
}
