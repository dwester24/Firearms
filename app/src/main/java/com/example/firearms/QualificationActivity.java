package com.example.firearms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QualificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);

        //Find View for Handgun Courses
        TextView handgunTextView = findViewById(R.id.handgun_text_view);

        //Set click listener Handgun Courses
        handgunTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will execute on click
                Intent handgunIntent = new Intent(QualificationActivity.this, HandgunQualActivity.class);
                startActivity(handgunIntent);
            }
        });

        //Find view for Shotgun Courses
        TextView shotgunTextView = findViewById(R.id.shotgun_text_view);

        //Set click listener for Shotgun courses
        shotgunTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will execute on click
                Intent shotgunIntent = new Intent(QualificationActivity.this, ShotgunQualActivity.class);
                startActivity(shotgunIntent);
            }
        });

        //Find view for Patrol Rifle
        TextView rifleTextView = findViewById(R.id.rifle_text_view);

        //Set click listener
        rifleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This code will execute on button click
                Intent rifleIntent = new Intent(QualificationActivity.this, PatrolRifleActivity.class);
                startActivity(rifleIntent);
            }
        });
    }
}