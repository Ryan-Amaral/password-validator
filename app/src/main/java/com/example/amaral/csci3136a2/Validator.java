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
        return 0; // stub
    }
}
