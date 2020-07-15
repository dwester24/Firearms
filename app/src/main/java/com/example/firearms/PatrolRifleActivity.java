package com.example.firearms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import RifleDay.RifleDay10;
import RifleNight.RifleNight10;

public class PatrolRifleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patrol_rifle);

        //Initialize Text Views
        TextView day = findViewById(R.id.day_text_view);
        TextView night = findViewById(R.id.night_text_view);

        //Set Day click listener
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patrol_day = new Intent(PatrolRifleActivity.this, RifleDay10.class);
                startActivity(patrol_day);
            }
        });

        //Set Night click listener
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patrol_night = new Intent(PatrolRifleActivity.this, RifleNight10.class);
                startActivity(patrol_night);
            }
        });
    }
}