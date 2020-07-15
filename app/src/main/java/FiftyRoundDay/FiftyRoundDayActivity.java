package FiftyRoundDay;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firearms.R;

public class FiftyRoundDayActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 2000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_round_day);

        //Initialize Text Views
        TextView firstSeq = findViewById(R.id.course1);
        TextView secondSeq = findViewById(R.id.course2);
        TextView thirdSeq = findViewById(R.id.course3);
        TextView courseDesc = findViewById(R.id.course_desc_text_view);

        //Initialize Buttons
        Button fireButton = findViewById(R.id.fire_button);
        Button nextButton = findViewById(R.id.calculate_button);

        //Set Course of Fire Text
        courseDesc.setText(R.string.threeYardDesc50);
        firstSeq.setText(R.string.threeYard);
        secondSeq.setText(R.string.threeYard);
        thirdSeq.setText(R.string.threeYard);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevenYard = new Intent(FiftyRoundDayActivity.this, FiftyRoundsSevenDay.class);
                startActivity(sevenYard);
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