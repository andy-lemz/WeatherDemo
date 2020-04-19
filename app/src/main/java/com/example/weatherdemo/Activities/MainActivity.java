package com.example.weatherdemo.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.weatherdemo.R;

public class MainActivity extends AppCompatActivity {

    private String CityLocalizedName = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.settings);

        CityLocalizedName = getIntent().getStringExtra("CityLocalizedName");
        TextView CurrentCity = (TextView) findViewById(R.id.CurrentCity);
        CurrentCity.setText(CityLocalizedName);

        SetTemperature();
    }

    public void SetTemperature(){
        TextView CurrentTemperatureForm = (TextView) findViewById(R.id.CurrentTemperature);
        TextView Plus1TForm = (TextView) findViewById(R.id.Plus1T);
        TextView Plus2TForm = (TextView) findViewById(R.id.Plus2T);
        TextView Plus3TForm = (TextView) findViewById(R.id.Plus3T);

        CurrentTemperatureForm.setText("15");
        Plus1TForm.setText("17");
        Plus2TForm.setText("16");
        Plus3TForm.setText("17");
    }

}
