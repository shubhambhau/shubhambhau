package com.example.day5layoutsandchangebackgroundcolorprogram;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (LinearLayout) findViewById(R.id.layout1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        l1.setBackgroundColor(Color.BLACK);
    }

    public void colorBW(View v) {

        int c1= ((ColorDrawable) l1.getBackground()).getColor();

        if (c1 == Color.BLACK){
            l1.setBackgroundColor(Color.WHITE);
            b1.setText("Black");
            b2.setText("Gray");
            b3.setText("Green");
            b4.setText("Pink");
        } else {
            l1.setBackgroundColor(Color.BLACK);
            b1.setText("White");
            b2.setText("Gray");
            b3.setText("Green");
            b4.setText("Pink");
        }
    }

    public void colorGray(View v) {

        int c1= ((ColorDrawable) l1.getBackground()).getColor();

        if (c1 == Color.MAGENTA|c1 == Color.GREEN|c1 == Color.YELLOW|c1 == Color.DKGRAY|c1 == Color.RED|c1 == Color.BLACK|c1 == Color.WHITE) {
            l1.setBackgroundColor(Color.GRAY);
            b2.setText("Yellow");
            b1.setText("Black");
            b3.setText("Green");
            b4.setText("Pink");
        } else {
            l1.setBackgroundColor(Color.YELLOW);
            b2.setText("Gray");
            b1.setText("Black");
            b3.setText("Green");
            b4.setText("Pink");
        }
    }

    public void colorGreen(View v) {

        int c1= ((ColorDrawable) l1.getBackground()).getColor();

        if (c1 == Color.MAGENTA|c1 == Color.GRAY|c1 == Color.YELLOW|c1 == Color.DKGRAY|c1 == Color.RED|c1 == Color.BLACK|c1 == Color.WHITE) {
            l1.setBackgroundColor(Color.GREEN);
            b3.setText("Dark Gray");
            b2.setText("Gray");
            b1.setText("Black");
            b4.setText("Pink");
        } else {

            l1.setBackgroundColor(Color.DKGRAY);
            b3.setText("Green");
            b2.setText("Gray");
            b1.setText("Black");
            b4.setText("Pink");
        }
    }

    public void colorWhite(View v) {

        int c1= ((ColorDrawable) l1.getBackground()).getColor();

        if (c1 == Color.GREEN|c1 == Color.GRAY|c1 == Color.YELLOW|c1 == Color.DKGRAY|c1 == Color.RED|c1 == Color.BLACK|c1 == Color.WHITE) {
            l1.setBackgroundColor(Color.MAGENTA);
            b1.setText("Black");
            b2.setText("Gray");
            b3.setText("Green");
            b4.setText("Red");
        } else {
            l1.setBackgroundColor(Color.RED);
            b1.setText("Black");
            b2.setText("Gray");
            b3.setText("Green");
            b4.setText("Pink");
        }
    }
}
//c1 == Color.MAGENTA|c1 == Color.GREEN|c1 == Color.GRAY|c1 == Color.YELLOW|c1 == Color.DKGRAY|c1 == Color.RED|c1 == Color.BLACK|c1 == Color.WHITE
/*
b1.setText("Black");
b2.setText("Gray");
b3.setText("Green");
b4.setText("Pink");
*/