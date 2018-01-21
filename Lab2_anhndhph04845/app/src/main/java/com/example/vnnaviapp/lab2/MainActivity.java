package com.example.vnnaviapp.lab2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView font = (TextView) findViewById(R.id.myFont);
        Typeface custom_font = Typeface.createFromAsset (getAssets (), "font/Blazed.ttf");
        font.setTypeface(custom_font);//kich hoat fonts
    }
}
