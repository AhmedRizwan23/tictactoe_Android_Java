package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static TextView player1;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, resetbutton;
    Button next_activity_button;
    TextView player2;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;
    ArrayList<String> myList = new ArrayList<>();

    public static int countOccurrences(ArrayList<String> list, String element) {
        int count = 0;
        for (String item : list) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;


    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        id_init();
        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.setText("Player X: 0");
                player2.setText("Player O: 0");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");


            }
        });
        next_activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext;
                inext = new Intent(MainActivity.this, page2_secondactivity.class);
                inext.putExtra("title", "this title is set using intent");
                inext.putExtra("studentname", "Ahmed");
                inext.putExtra("Rollno", 10);

                startActivity(inext);

            }


        });

    }

    private void id_init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        resetbutton = findViewById(R.id.resetbutton);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        next_activity_button = findViewById(R.id.buttonnext);

    }

    public void Check(View view) {
        Button btncurrent = (Button) view;
        System.out.println("btncudddrrent" + btncurrent);
        if (btncurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btncurrent.setText("x");
                flag++;
                System.out.println("flag" + flag);
            } else {
                btncurrent.setText("0");
                flag--;
                System.out.println("flag" + flag);
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                System.out.println("value of b1 is " + b1);
                b2 = btn2.getText().toString();
                System.out.println("value of b2 is " + b2);
                b3 = btn3.getText().toString();
                System.out.println("value of b3 is " + b3);
                b4 = btn4.getText().toString();
                System.out.println("value of b4 is " + b4);
                b5 = btn5.getText().toString();
                System.out.println("value of b5 is " + b5);
                b6 = btn6.getText().toString();
                System.out.println("value of b6 is " + b6);
                b7 = btn7.getText().toString();
                System.out.println("value of b7 is " + b7);
                b8 = btn8.getText().toString();
                System.out.println("value of b8 is " + b8);
                b9 = btn9.getText().toString();
                System.out.println("value of b9 is " + b9);
                //conditons
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "winner is " + b1, Toast.LENGTH_SHORT).show();
                    clearbuttons();

                    myList.add(b1);
                    System.out.println("list is " + myList);
                    winsloss();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "winner is " + b4, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b4);
                    winsloss();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "winner is " + b7, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b7);
                    winsloss();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "winner is " + b1, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b1);
                    winsloss();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "winner is " + b2, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b2);
                    winsloss();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "winner is " + b3, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b3);
                    winsloss();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "winner is " + b1, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b1);
                    winsloss();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "winner is " + b3, Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    myList.add(b3);
                    winsloss();
                } else if (count == 9) {
                    Toast.makeText(this, "no winner", Toast.LENGTH_SHORT).show();
                    clearbuttons();
                    winsloss();
                }
                System.out.println("list is " + myList);
                winsloss();
            }
        }
    }

    private void winsloss() {
        int countX = countOccurrences(myList, "x");
        int countO = countOccurrences(myList, "0");
        System.out.println("Number of 'x': " + countX);
        System.out.println("Number of '0': " + countO);
        if (countX > 0 || countO > 0) {
            player1.setText("Player X: " + countX);
            player2.setText("Player O: " + countO);
        } else {
            player1.setText("Player X: 0");
            player2.setText("Player O: 0");
        }
    }

    private void clearbuttons() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                flag = 0;
                count = 0;


            }
        }, 2000);


    }
}