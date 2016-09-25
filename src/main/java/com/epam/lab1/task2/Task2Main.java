package com.epam.lab1.task2;

import com.epam.lab1.task2.bl.Region;
import com.epam.lab1.task2.entity.Point;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the y: ");
            double y = scanner.nextDouble();

            System.out.println("Result: " + Region.isInclude(new Point(x, y)));
        }
        catch (InputMismatchException e){
            System.out.println("Error: incorrect value");
        }
        finally {
            scanner.close();
        }
    }

}
