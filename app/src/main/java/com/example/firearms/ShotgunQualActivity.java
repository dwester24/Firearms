package com.example.firearms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ShotgunDay.ShotgunDay15;
import ShotgunNight.ShotgunNight15;

public class ShotgunQualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotgun_qual);

        //Initialize Text Views
        TextView day_course = findViewById(R.id.day_text_view);
        TextView night_course = findViewById(R.id.night_text_view);

        //Set Day Course click listener
        day_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent day = new Intent(ShotgunQualActivity.this, ShotgunDay15.class);
                startActivity(day);
            }
        });

        //Set Night Course click listener
        night_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent night = new Intent(ShotgunQualActivity.this, ShotgunNight15.class);
                startActivity(night);
            }
        });

    }
}