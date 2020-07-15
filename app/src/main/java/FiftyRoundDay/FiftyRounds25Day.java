package FiftyRoundDay;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firearms.MainActivity;
import com.example.firearms.R;

import Calculator.FiftyRound;

public class FiftyRounds25Day extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 60000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_rounds25_day);

        //Initialize buttons
        Button fireButton = findViewById(R.id.fire_button);


        //Set Home Button on click listener

        Button homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(FiftyRounds25Day.this, MainActivity.class);
                startActivity(home);
            }
        });

        //Set Calculator Button click listener
        Button calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculator = new Intent(FiftyRounds25Day.this, FiftyRound.class);
                startActivity(calculator);
            }
        });

        //Set Fire Button on click listener
        fireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });


    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                shakeItBaby();
            }
        }.start();
    }

    private void shakeItBaby() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(3000, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(3000);
        }
    }
}