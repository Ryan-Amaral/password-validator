package com.example.amaral.csci3136a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Validator extends AppCompatActivity {

    public Validator(){
        setMaxSuccess(2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected int maxSuccess; // amount of tests

    public int getMaxSuccess() {
        return maxSuccess;
    }
    public void setMaxSuccess(int maxSuccess) {
        this.maxSuccess = maxSuccess;
    }

    protected int validate(String pass){
        int successes = 0;
        if(valNotPassword(pass))
                successes++;
        if(valLength(pass))
            successes++;
        return successes;
    }

    protected boolean valNotPassword(String pass){
        return !pass.toLowerCase().equals("password");
    }

    protected boolean valLength(String pass){
        return pass.length() >= 8;
    }
}
