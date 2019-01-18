package com.ballebaaz.samplescorecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView scoreTextView, wicketsTextView, oversTextView;
private Button addRunsButton, reduceRunsButton, addWicketsButton, reduceWicketsButton, addBallsButton, reduceBallsButton;
private ScoreCalculator scoreCalculator = new ScoreCalculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTextView = findViewById(R.id.score);
        wicketsTextView = findViewById(R.id.wickets);
        oversTextView = findViewById(R.id.overs);

        addRunsButton = findViewById(R.id.add_runs);
        reduceRunsButton = findViewById(R.id.reduce_runs);
        addWicketsButton = findViewById(R.id.add_wickets);
        reduceWicketsButton = findViewById(R.id.reduce_wickets);
        addBallsButton = findViewById(R.id.add_balls);
        reduceBallsButton = findViewById(R.id.reduce_balls);


        addRunsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.addRuns();
                updateViews();
            }
        });


        reduceRunsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.reduceRuns();
                updateViews();
            }
        });
        addBallsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.addBalls();
                updateViews();
            }
        });
        reduceBallsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.reduceBalls();
                updateViews();
            }
        });
        addWicketsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.addWickets();
                updateViews();
            }
        });
        reduceWicketsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCalculator.reduceWickets();
                updateViews();
            }
        });


    }

    void updateViews(){
        scoreTextView.setText("Score : "+scoreCalculator.getScore());
        oversTextView.setText("Total balls played : "+scoreCalculator.getBalls());
        wicketsTextView.setText("Total wickets fallen : "+scoreCalculator.getWickets());
    }


}
