package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AnswerButton;
        AnswerButton = (Button) findViewById(R.id.AnswerButton);

        final ImageView EightBall = (ImageView) findViewById(R.id.image_EightBall);

        final int[] AnswerArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        AnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random RandomNumberGenerator = new Random();
                int number = RandomNumberGenerator.nextInt(5);
                EightBall.setImageResource(AnswerArray [number]);
            }
        });


    }
}
