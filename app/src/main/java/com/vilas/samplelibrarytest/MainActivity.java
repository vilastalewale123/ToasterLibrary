package com.vilas.samplelibrarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vilas.mylibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this,"Hi Vilas");
    }
}