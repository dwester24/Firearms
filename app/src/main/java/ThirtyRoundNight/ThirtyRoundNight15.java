package ThirtyRoundNight;

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

public class ThirtyRoundNight15 extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 20000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_round_night15);

        //Initialize Buttons
        Button fire_button = findViewById(R.id.fire_button);
        Button calculator = findViewById(R.id.calculate_button);
        Button home = findViewById(R.id.home_button);

        //Set  Fire Button click listener
        fire_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        //Set Home Button click listener
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_intent = new Intent(ThirtyRoundNight15.this, MainActivity.class);
                startActivity(home_intent);
            }
        });

        //Set Calculate Button click listener
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculate_intent = new Intent(ThirtyRoundNight15.this, ThirtyRoundActivity.class);
                startActivity(calculate_intent);
            }
        });


    }

    public void startTimer() {
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