package com.bogdancristian.logicgate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selector);
    }

    public void openLvl1(View view){
        Intent intent = new Intent(this , Level1.class);
        startActivity(intent);
    }


}
