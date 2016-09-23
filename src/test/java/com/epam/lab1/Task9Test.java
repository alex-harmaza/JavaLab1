package com.epam.lab1;

import com.epam.lab1.task9.entity.Ball;
import com.epam.lab1.task9.entity.Bucket;
import com.epam.lab1.task9.entity.Color;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;


public class Task9Test extends Assert {

    @Test(expected = IllegalArgumentException.class)
    public void negativeBallWeight(){
        new Ball(-7.2, Color.BLACK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroBallWeight(){
        new Ball(0, Color.BLACK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullBallColor(){
        new Ball(1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullInBucket(){
        Bucket bucket = new Bucket(Arrays.asList(new Ball(1, Color.BLACK)));
        bucket.add(null);
    }

    @Test
    public void checkSumBallWeight(){
        List<Ball> balls = Arrays.asList(new Ball(0.165, Color.BLACK),
                new Ball(1.15, Color.YELLOW), new Ball(1.28, Color.BLACK));
        Bucket bucket = new Bucket(balls);

        double weight = 0;
        for (Ball ball : balls){
            weight += ball.getWeight();
        }

        assertEquals("Incorrect bucket weight", weight, bucket.getWeightAllBalls(), 0.00000000001);
    }

    @Test
    public void checkBallCountByColor(){
        List<Ball> balls = Arrays.asList(new Ball(0.165, Color.BLACK),
                new Ball(1.15, Color.BLUE), new Ball(1.28, Color.BLUE), new Ball(1, Color.YELLOW));
        Bucket bucket = new Bucket(balls);

        long count = 0;
        for (Ball ball : balls){
            if (ball.getColor().equals(Color.BLUE)){
                count++;
            }
        }

        assertEquals("Incorrect blue ball count in bucket", count, bucket.getBallCountByColor(Color.BLUE));
    }
}
