package Calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firearms.R;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Find 30 Round Text View
        TextView thirty_round_calculator = findViewById(R.id.thirty_round_score);

        //Set click listener

        thirty_round_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code will execute when clicked
                Intent thirty_round_score_intent = new Intent(CalculatorActivity.this, ThirtyRoundActivity.class);
                startActivity(thirty_round_score_intent);
            }
        });

        //Find 50 Round Text View
        TextView fifty_round_calculator = findViewById(R.id.fifty_rounds_score);

        //Set click listener
        fifty_round_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code executes when clicked
                Intent fifty_round_score_intent = new Intent(CalculatorActivity.this, FiftyRound.class);
                startActivity(fifty_round_score_intent);
            }
        });

        //Find Shotgun Text View
        TextView shotgun_score_calculator = findViewById(R.id.shotgun_score);

        //Set click listener
        shotgun_score_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code executes on click
                Intent shotgun_score_intent = new Intent(CalculatorActivity.this, Shotgun.class);
                startActivity(shotgun_score_intent);
            }
        });
    }
}