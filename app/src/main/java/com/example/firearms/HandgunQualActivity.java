package com.example.firearms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import FiftyRoundDay.FiftyRoundDayActivity;
import FiftyRoundNight.FifityRoundNightActivity;
import ThirtyRoundDay.ThirtyRoundDayActivity;
import ThirtyRoundNight.ThirtyRoundNightActivity;

public class HandgunQualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handgun_qual);

        //Find view for 30 rounds Day
        TextView thirtyRoundDayTextView = findViewById(R.id.thirty_round_day);

        //Set click listener
        thirtyRoundDayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code executes on click
                Intent thirtyRoundDayIntent = new Intent(HandgunQualActivity.this, ThirtyRoundDayActivity.class);
                startActivity(thirtyRoundDayIntent);
            }
        });

        //Find view for 30 Rounds Night
        TextView thirtyRoundsNightTextView = findViewById(R.id.thirty_round_night);

        //Set click listener
        thirtyRoundsNightTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will execute on click
                Intent thirtyRoundNightIntent = new Intent(HandgunQualActivity.this, ThirtyRoundNightActivity.class);
                startActivity(thirtyRoundNightIntent);
            }
        });

        //Find view for 50 rounds Day
        TextView fiftyRoundDayTextView = findViewById(R.id.fifty_round_day);

        //Set click listener
        fiftyRoundDayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will execute on click
                Intent fiftyRoundDayIntent = new Intent(HandgunQualActivity.this, FiftyRoundDayActivity.class);
                startActivity(fiftyRoundDayIntent);
            }
        });

        //Find View for 50 Rounds Night
        TextView fiftyRoundsNightTextView = findViewById(R.id.fifty_round_night);

        // Set click Listener
        fiftyRoundsNightTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code will execute on click
                Intent fiftyRoundNightIntent = new Intent(HandgunQualActivity.this, FifityRoundNightActivity.class);
                startActivity(fiftyRoundNightIntent);

            }
        });
    }
}