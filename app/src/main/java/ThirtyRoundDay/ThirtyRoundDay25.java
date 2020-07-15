package ThirtyRoundDay;

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

import Calculator.ThirtyRoundActivity;
import FiftyRoundDay.FiftyRounds25Day;

public class ThirtyRoundDay25 extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 25000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_round_day25);

        //Initialize buttons
        Button fireButton = findViewById(R.id.fire_button);


        //Set Home Button on click listener

        Button homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(ThirtyRoundDay25.this, MainActivity.class);
                startActivity(home);
            }
        });

        //Set Calculator Button click listener
        Button calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculator = new Intent(ThirtyRoundDay25.this, ThirtyRoundActivity.class);
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