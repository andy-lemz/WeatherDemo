package com.example.weatherdemo.Activities;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherdemo.Cities;

public class CitiesActivity extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        ListAdapter adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, Cities.GetNameAllRegions());
        setListAdapter(adapter);

    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        TextView textView = (TextView) v;
        String itemText = textView.getText().toString();

        Toast.makeText(getActivity(), "Вы выбрали " + itemText, Toast.LENGTH_SHORT).show();
    }
}
