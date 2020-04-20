package com.example.weatherdemo.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherdemo.Cities;
import com.example.weatherdemo.R;

public class CitiesActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.choose_city);

        ListView list = findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, Cities.GetNameAllRegions());
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                String itemText = textView.getText().toString();

                if (!itemText.isEmpty()){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("CityLocalizedName", itemText);
                startActivity(intent);
                }
            }
        });

    }

}
