package com.ballebaaz.samplescorecalculator;

public class ScoreCalculator {
    private int score,balls,wickets;

    public ScoreCalculator() {
        this.score = 0;
        this.wickets = 0;
        this.balls= 0;
    }

    public String getScore() {
        return String.valueOf(score);
    }

    public String getBalls() {
        return String.valueOf(balls);
    }

    public String getWickets() {
        return String.valueOf(wickets);
    }

    public void addRuns(){
        score++;
    }
    public void addBalls(){
        balls++;
    }
    public void addWickets(){
        wickets++;
        wickets = wickets>10?0:wickets;

    }

    public void reduceRuns(){
        score--;
        score = score<0?0:score;
    }
    public void reduceBalls(){
        balls--;
        balls = balls<0?0:balls;
    }
    public void reduceWickets(){
        wickets--;
        wickets = wickets<0?0:wickets;
    }
}
