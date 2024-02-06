package com.example.edittext01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView num1;
    TextView num2;
    EditText answer;
    ImageView xpic;
    ImageView vpic;

    Button check;
    Button clear;
//lvl2
    TextView level1ans;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //level1
        num1 = findViewById(R.id.number1lvl);
        num2 = findViewById(R.id.number2lvl1);
        answer = (EditText) findViewById(R.id.answerlvl1);
        xpic = (ImageView) findViewById(R.id.xlvl1);
        vpic = (ImageView) findViewById(R.id.vlvl1);
        check = (Button) findViewById(R.id.revealanslvl1);
        clear= (Button) findViewById(R.id.clear);
        final int random1 = new Random().nextInt(89) + 10;
        final int random2 = new Random().nextInt(89) + 10;

        num1.setText(Integer.toString(random1));
        num2.setText(Integer.toString(random2));
        //level2






    }

    public void change(View view) {

        String NUMBER1 = num1.getText().toString();
        int number1 =  Integer.parseInt(NUMBER1);
        String NUMBER2 = num2.getText().toString();
        int number2 =  Integer.parseInt(NUMBER2);
        String str = answer.getText().toString();
        int ans = Integer.parseInt(str);
        if(ans== number1+number2){
            vpic.setVisibility(View.VISIBLE);


        }else{
            xpic.setVisibility(View.VISIBLE);
        }

    }
}