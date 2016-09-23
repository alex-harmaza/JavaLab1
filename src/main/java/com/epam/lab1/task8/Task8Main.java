package com.epam.lab1.task8;

import com.epam.lab1.task8.bl.Sequence;

import java.util.Arrays;
import java.util.Scanner;


public class Task8Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first sequence count: ");
        double[] firstSequence = new double[scanner.nextInt()];
        for (int i = 0; i < firstSequence.length; i++){
            System.out.print("Value " + i + ": ");
            firstSequence[i] = scanner.nextDouble();
        }

        System.out.print("Enter the second sequence count: ");
        double[] secondSequence = new double[scanner.nextInt()];
        for (int i = 0; i < secondSequence.length; i++){
            System.out.print("Value " + i + ": ");
            secondSequence[i] = scanner.nextDouble();
        }

        System.out.println("Result: "
                + Arrays.toString(Sequence.createAscendingSequence(firstSequence, secondSequence)));
    }

}
