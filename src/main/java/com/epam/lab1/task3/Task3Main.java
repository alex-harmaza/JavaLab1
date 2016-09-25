package com.epam.lab1.task3;

import com.epam.lab1.task3.bl.Math;
import com.epam.lab1.task3.entity.Segment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the bottom line : ");
            double bottomLine = scanner.nextDouble();

            System.out.print("Enter the upper bound: ");
            double upperLine = scanner.nextDouble();

            System.out.print("Enter the step: ");
            double step = scanner.nextDouble();

            System.out.println("Result:\n" + Math.tan(new Segment(bottomLine, upperLine), step));
        }
        catch (InputMismatchException e){
            System.out.println("Error: incorrect value");
        }
        finally {
            scanner.close();
        }
    }

}
