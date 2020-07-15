package Calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firearms.MainActivity;
import com.example.firearms.R;

public class Shotgun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotgun);


        //Initialize buttons
        Button calculate_button = findViewById(R.id.calculate_button);
        Button home = findViewById(R.id.home_button);

        //Set Calculate click listener
        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore();
            }
        });

        //Set Home click listener
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Shotgun.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

    }

    public void finalScore() {
        //Initialize EditText Views
        EditText buckshot = findViewById(R.id.buckshot_hits);
        EditText slugsIn7 = findViewById(R.id.seven_ring_slug);
        EditText slugsOutside7 = findViewById(R.id.outside_slugs);

        //Initialize TextView
        TextView scoreTextView = findViewById(R.id.score_text_view);

        //Convert to Strings
        String buckStr = buckshot.getText().toString();
        String Slug7Str = slugsIn7.getText().toString();
        String SlugOutsideStr = slugsOutside7.getText().toString();

        //Parse Integers
        int buckshotScore = Integer.parseInt(buckStr);
        int slug7Score = Integer.parseInt(Slug7Str);
        int slugOutsideScore = Integer.parseInt(SlugOutsideStr);

        //Calculate Score
        int score = (slug7Score * 11) + (slugOutsideScore * 6) + buckshotScore;
        scoreTextView.setText(String.valueOf(score));
    }
}