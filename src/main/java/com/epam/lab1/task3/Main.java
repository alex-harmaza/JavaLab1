package com.epam.lab1.task3;

import com.epam.lab1.task3.bl.Math;
import com.epam.lab1.task3.entity.Segment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bottom line : ");
        double bottomLine = scanner.nextDouble();

        System.out.print("Enter the upper bound: ");
        double upperLine = scanner.nextDouble();

        System.out.print("Enter the step: ");
        double step = scanner.nextDouble();

        System.out.println("Result:\n" + Math.tan(new Segment(bottomLine, upperLine), step));

    }

}
