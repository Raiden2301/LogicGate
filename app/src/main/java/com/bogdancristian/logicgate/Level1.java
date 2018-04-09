package com.bogdancristian.logicgate;

import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Level1 extends AppCompatActivity {

    PointF pointA = new PointF(100, 100);
    PointF pointB = new PointF(100, 300);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

    }
}