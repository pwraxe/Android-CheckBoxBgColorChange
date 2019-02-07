package com.example.akshay.checkedboxdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity
{
    CheckBox yellow,red,blue,pink,green,white,gray;
    LinearLayout linearL;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yellow = findViewById(R.id.yellow_id);
        red = findViewById(R.id.red_id);
        blue = findViewById(R.id.blue_id);
        pink = findViewById(R.id.pink_id);
        green = findViewById(R.id.green_id);
        white = findViewById(R.id.white_id);
        gray = findViewById(R.id.gray_id);
        linearL = findViewById(R.id.linear);



        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yellow.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.yellow));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));

            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(red.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.red));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blue.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.blue));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pink.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.pink));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(green.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.green));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gray.isChecked())
                    linearL.setBackgroundColor(getResources().getColor(R.color.gray));
                else
                    linearL.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

    }

}
