package com.example.edittext01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView num1;
    TextView num2;
    EditText answer;
    ImageView vx;
    Button check;
    Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.number1lvl);
        num2 = findViewById(R.id.number2lvl1);
        answer = findViewById(R.id.answerlvl1);
        vx = findViewById(R.id.lvl1truefalse);
        check = findViewById(R.id.revealanslvl1);
        clear= findViewById(R.id.clear);

        final int random = new Random().nextInt(61) + 20;

        num1.setText(Integer.toString(random1));





    }
}