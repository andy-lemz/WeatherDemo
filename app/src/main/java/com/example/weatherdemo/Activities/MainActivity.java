package com.example.weatherdemo.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.weatherdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.choose_city);
        //setContentView(R.layout.settings);
    }

}
