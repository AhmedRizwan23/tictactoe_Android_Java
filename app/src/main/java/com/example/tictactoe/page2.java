package com.example.tictactoe;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class page2 extends AppCompatActivity {
    Switch switch1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page2);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<contactmodel> arraycontacts = new ArrayList<>();


        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "a", "323"));
        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "b", "323232"));

        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "c", "323"));
        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "d", "323232"));

        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "e", "323"));
        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "f", "323232"));

        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "g", "323"));
        arraycontacts.add(new contactmodel(R.drawable.ic_launcher_background, "h", "323232"));

        RecycleContactAdapter adapter = new RecycleContactAdapter(this, arraycontacts);

        recyclerView.setAdapter(adapter);

    }
}