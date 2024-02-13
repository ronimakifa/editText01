package com.example.edittext01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    TextView anslevel1;
    TextView num3;
    EditText answer2;
    ImageView xpic2;
    ImageView vpic2;
    Button check2;
    //lvl3
    TextView anslvl2;
    TextView num4;
    EditText answerlvl3;
    ImageView xpic3;
    ImageView vpic3;
    Button check3;
     int right = 0;




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
        final int random3 = new Random().nextInt(89) + 10;
        final int random4 = new Random().nextInt(89) + 10;

        num1.setText(Integer.toString(random1));
        num2.setText(Integer.toString(random2));
        //level2
        anslevel1 = findViewById(R.id.anslvl1);
        num3 = findViewById(R.id.number2lvl2);
        answer2 = (EditText) findViewById(R.id.answerlvl2);
        xpic2 = (ImageView) findViewById(R.id.xpiclvl2);
        vpic2 = (ImageView) findViewById(R.id.vpiclvl2);
        check2 = (Button) findViewById(R.id.checklvl2);
        num3.setText(Integer.toString(random3));
        //level3
        anslvl2 = findViewById(R.id.anslvl2);
        num4 = findViewById(R.id.numberr2lvl3);
        answerlvl3 = (EditText) findViewById(R.id.answerlvl3);
        xpic3 = (ImageView) findViewById(R.id.xpic3);
        vpic3 = (ImageView) findViewById(R.id.vpic3);
        check3 = (Button) findViewById(R.id.checklvl3);
        num4.setText(Integer.toString(random4));






    }



    public void change(View view) {
        final int random1 = new Random().nextInt(89) + 10;
        final int random2 = new Random().nextInt(89) + 10;

        String NUMBER1 = num1.getText().toString();
        int number1 =  Integer.parseInt(NUMBER1);
        String NUMBER2 = num2.getText().toString();
        int number2 =  Integer.parseInt(NUMBER2);
        String str = answer.getText().toString();
        int ans = Integer.parseInt(str);
        if(ans== number1+number2){
            right++;
            vpic.setVisibility(View.VISIBLE);


        }else{
            xpic.setVisibility(View.VISIBLE);
        }
        String NUMBER3 = num3.getText().toString();
        int number3 =  Integer.parseInt(NUMBER3);
        int finalans1 = number1+number2;
        String finalans = String.valueOf(finalans1);
        anslevel1.setText(finalans);
        anslevel1.setVisibility(View.VISIBLE);
        num3.setVisibility(View.VISIBLE);
        answer2.setVisibility(View.VISIBLE);
        check2.setVisibility(View.VISIBLE);



    }


    public void change2(View view) {
        final int random3 = new Random().nextInt(89) + 10;
        String NUMBER1 = num1.getText().toString();
        int number1 =  Integer.parseInt(NUMBER1);
        String NUMBER2 = num2.getText().toString();
        int number2 =  Integer.parseInt(NUMBER2);
        String NUMBER3 = num3.getText().toString();
        int number3 =  Integer.parseInt(NUMBER3);
        int finalans1 = number1+number2;
        String str = answer2.getText().toString();
        int ans = Integer.parseInt(str);
        if(ans == finalans1 + number3){
            vpic2.setVisibility(View.VISIBLE);
            right++;
        }else{
            xpic2.setVisibility(View.VISIBLE);
        }
        String NUMBER4 = num4.getText().toString();
        int number4 =  Integer.parseInt(NUMBER4);
        int finalans2 = number3+finalans1;
        String finalans = String.valueOf(finalans2);
        anslvl2.setText(finalans);
        anslvl2.setVisibility(View.VISIBLE);
        num4.setVisibility(View.VISIBLE);
        answerlvl3.setVisibility(View.VISIBLE);
        check3.setVisibility(View.VISIBLE);




    }

    public void change3(View view) {
        final int random4 = new Random().nextInt(89) + 10;
        String NUMBER1 = num1.getText().toString();
        int number1 =  Integer.parseInt(NUMBER1);
        String NUMBER2 = num2.getText().toString();
        int number2 =  Integer.parseInt(NUMBER2);
        int finalans1 = number1+number2;
        String NUMBER3 = num3.getText().toString();
        int number3 =  Integer.parseInt(NUMBER3);
        int finalans2 = number3+finalans1;
        String NUMBER4 = num4.getText().toString();
        int number4 =  Integer.parseInt(NUMBER4);
        String str = answerlvl3.getText().toString();
        int ans = Integer.parseInt(str);
        if(ans == finalans2 + number4){
            vpic3.setVisibility(View.VISIBLE);
            right++;

        }else{
            xpic3.setVisibility(View.VISIBLE);
        }
        Toast.makeText(getApplicationContext(), right + "/3", Toast.LENGTH_LONG).show();

    }

    public void clear(View view) {
        right =0;
        final int random1 = new Random().nextInt(89) + 10;
        final int random2 = new Random().nextInt(89) + 10;
        num1.setText(Integer.toString(random1));
        num2.setText(Integer.toString(random2));
        xpic = (ImageView) findViewById(R.id.xlvl1);
        vpic = (ImageView) findViewById(R.id.vlvl1);
        xpic.setVisibility(View.INVISIBLE);
        vpic.setVisibility(View.INVISIBLE);
        answer.setText("0");


         anslevel1.setVisibility(View.INVISIBLE);
        num3.setVisibility(View.INVISIBLE);

         answer2.setVisibility(View.INVISIBLE);
         answer2.setText("0");

        xpic2.setVisibility(View.INVISIBLE);
        vpic2.setVisibility(View.INVISIBLE);
        check2.setVisibility(View.INVISIBLE);
        //lvl3
        anslvl2.setVisibility(View.INVISIBLE);
        num4.setVisibility(View.INVISIBLE);
        answerlvl3.setVisibility(View.INVISIBLE);
        answerlvl3.setText("0");
        xpic3.setVisibility(View.INVISIBLE);
        vpic3.setVisibility(View.INVISIBLE);
        check3.setVisibility(View.INVISIBLE);

    }
}