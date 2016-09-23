package com.epam.lab1.task9.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aliaksandr_Harmaza on 9/21/2016.
 */
public class Bucket {

    private List<Ball> balls;


    public void Bucket(){
        balls = new ArrayList<Ball>();
    }

    public Bucket(List<Ball> balls){
        this.balls = balls;
    }


    public Ball get(int index){
        return balls.get(index);
    }

    public void add(Ball ball){
        if (ball == null){
            throw new IllegalArgumentException("Ball is null");
        }
        balls.add(ball);
    }

    public List<Ball> getBalls(){
        return balls;
    }

    public void setBalls(List<Ball> balls){
        this.balls = balls;
    }

    public double getWeightAllBalls(){
        double sum = 0;
        for (Ball ball : balls){
            sum += ball.getWeight();
        }
        return sum;
    }

    public long getBallCountByColor(Color color){
        if (color == null){
            throw new IllegalArgumentException("Color is null");
        }

        long count = 0;
        for (Ball ball : balls){
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
}
