package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page2_secondactivity extends AppCompatActivity {

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

        txtstudentinfo.setText(" Roll no" + rollno + "Student Name: " + studentname + "Title: " + title);
        getSupportActionBar().setTitle(title);
    }
}