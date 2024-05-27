package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class page2_secondactivity extends AppCompatActivity {

    ListView listview;
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrNames = new ArrayList<>();//Arraylist is not static it can be used when we dont know how many items we will be adding at runtime
    int[] arrNo = new int[]{1, 2, 3, 4, 5};//this is how simple array is defined it is of fix length
    ArrayList<String> arrids = new ArrayList<>();
    ArrayList<String> arrtxtview = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page2_secondactivity);
        Intent fromactivity = getIntent();
        String title = fromactivity.getStringExtra("title");
        String studentname = fromactivity.getStringExtra("studentname");
        int rollno = fromactivity.getIntExtra("Rollno", 0);


        System.out.println("Title: " + title);
        System.out.println("Student Name: " + studentname);
        System.out.println("Roll No: " + rollno);
        TextView txtstudentinfo = findViewById(R.id.txtstudentinfo);
        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.actxtview);

        txtstudentinfo.setText(" Roll no" + rollno + "Student Name: " + studentname + "Title: " + title);
        getSupportActionBar().setTitle(title);
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");
        arrNames.add("Ahmed");
        arrNames.add("ali");
        arrNames.add("123");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrNames);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "You have selected " + arrNames.get(position) + " at position " + position, Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(), "You have selected " + arrNames.get(position) + " at position " + position, Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "You have selected " + arrNames.get(position) + " at position " + position, Toast.LENGTH_SHORT).show();

                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "You have selected " + arrNames.get(position) + " at position " + position, Toast.LENGTH_SHORT).show();

                }

            }


        });
        arrids.add("1");
        arrids.add("2");
        arrids.add("3");
        arrids.add("4");
        arrids.add("5");
        arrids.add("6");

        ArrayAdapter<String> spinneradapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrids);

        spinner.setAdapter(spinneradapter);

        arrtxtview.add("c");
        arrtxtview.add("pyth");
        arrtxtview.add("java");
        arrtxtview.add("js");

        ArrayAdapter<String> autoadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrtxtview);
        autoCompleteTextView.setAdapter(autoadapter);
        autoCompleteTextView.setThreshold(3);

    }

}