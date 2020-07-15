package Calculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firearms.MainActivity;
import com.example.firearms.R;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ThirtyRoundActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_round);

        //Initialize Edit Text Views
        final EditText fiveRingHits = findViewById(R.id.five_ring_hits);
        final EditText fourRingHits = findViewById(R.id.four_ring_hits);
        final EditText threeRingHits = findViewById(R.id.three_ring_hits);

        // Initialize Text Views
        final TextView fiveRingTotal = findViewById(R.id.five_ring_total);
        final TextView fourRingTotal = findViewById(R.id.four_ring_total);
        final TextView threeRingTotal = findViewById(R.id.three_ring_total);


        fiveRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fiveStr = fiveRingHits.getText().toString();
                int fiveHits = Integer.parseInt(fiveStr);
                int fiveScore = 0;
                fiveScore = fiveHits * 5;
                fiveRingTotal.setText(String.valueOf(fiveScore));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        fourRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String fourStr = fourRingHits.getText().toString();
                int fourHits = Integer.parseInt(fourStr);
                int fourScore = 0;
                fourScore = fourHits * 4;
                fourRingTotal.setText(String.valueOf(fourScore));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        threeRingHits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String threeStr = threeRingHits.getText().toString();
                int threeHits = Integer.parseInt(threeStr);
                int threeScore = 0;
                threeScore = threeHits * 3;
                threeRingTotal.setText(String.valueOf(threeScore));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Initialize buttons
        Button calculate = findViewById(R.id.calculate_button);
        Button home = findViewById(R.id.home_button);

        //Set Calculate click listener
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore();
            }
        });

        //Set Home click listener
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(ThirtyRoundActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

    }

    public void finalScore() {
        //Declare TextViews
        TextView sum5Ring = findViewById(R.id.five_ring_total);
        TextView sum4Ring = findViewById(R.id.four_ring_total);
        TextView sum3Ring = findViewById(R.id.three_ring_total);
        TextView score = findViewById(R.id.score_text_view);

        //Convert to Strings
        String fiveStr = sum5Ring.getText().toString();
        String fourStr = sum4Ring.getText().toString();
        String threeStr = sum3Ring.getText().toString();

        //Parse to Integer
        int fiveScore = Integer.parseInt(fiveStr);
        int fourScore = Integer.parseInt((fourStr));
        int threeScore = Integer.parseInt((threeStr));

        //Calculate Score
        double scoreFinal = (fiveScore + fourScore + threeScore) * 2 / 3.0;
        DecimalFormat scoreFormat = new DecimalFormat("00.0");
        scoreFormat.setRoundingMode(RoundingMode.FLOOR);
        String finalScore = scoreFormat.format(scoreFinal);
        score.setText(finalScore);


    }



}