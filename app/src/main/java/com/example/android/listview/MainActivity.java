package com.example.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create a listView
        ListView colorsListView = findViewById(R.id.listView);
        //Create ArrayList
        ArrayList<String> colorsArrayList = new ArrayList<>();
        colorsArrayList.add("Red");
        colorsArrayList.add("Orange");
        colorsArrayList.add("Yellow");
        colorsArrayList.add("Green");
        colorsArrayList.add("Blue");
        colorsArrayList.add("Indigo");
        colorsArrayList.add("Violet");

        //Create an adapter to bind colorsArrayList and data
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,colorsArrayList);

        //Set arrayAdapter on colorsListView
        colorsListView.setAdapter(arrayAdapter);

        colorsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Number "+position+"-"+colorsArrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}