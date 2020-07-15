package com.example.firearms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import Calculator.CalculatorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find View for Qualification Course View
        TextView qualCourse = findViewById(R.id.qual_courses);

        //Set click listen on Qualification View
        qualCourse.setOnClickListener(new View.OnClickListener() {
            //This code will execute when clicked on
            @Override
            public void onClick(View v) {
                Intent qualIntent = new Intent(MainActivity.this, QualificationActivity.class);
                startActivity(qualIntent);
            }
        });

        //Find View for Calculator
        TextView calculator = findViewById(R.id.calculator);

        //Set click listener for Calculator
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calculatorIntent);
            }
        });

    }

}
