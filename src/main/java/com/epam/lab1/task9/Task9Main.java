package com.epam.lab1.task9;

import com.epam.lab1.task9.entity.Ball;
import com.epam.lab1.task9.entity.Bucket;
import com.epam.lab1.task9.entity.Color;

import java.util.Arrays;
import java.util.Scanner;


public class Task9Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of balls: ");
        Ball[] balls = new Ball[scanner.nextInt()];

        for (int i = 0; i < balls.length; i++){
            System.out.print("Enter the ball [" + i + "] weight: ");
            double weight = scanner.nextDouble();

            scanner.nextLine();
            System.out.print("Enter the ball [" + i + "] color (black, green, yellow, blue): ");
            Color color = Color.valueOf(scanner.nextLine().toUpperCase());

            balls[i] = new Ball(weight, color);
        }

        Bucket bucket = new Bucket(Arrays.asList(balls));
        System.out.println("Result:\n\ttotal weight: " + bucket.getWeightAllBalls()
                + "\n\tblue ball count: " + bucket.getBallCountByColor(Color.BLUE));
    }

}
