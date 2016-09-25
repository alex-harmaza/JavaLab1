package com.epam.lab1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task1Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the x: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the y: ");
            double y = scanner.nextDouble();

            System.out.println("Result: " + Expression.consider(x, y));
        }
        catch (InputMismatchException e){
            System.out.println("Error: incorrect value");
        }
        finally {
            scanner.close();
        }
    }

}
