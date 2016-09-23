package com.epam.lab1.task4;

import com.epam.lab1.task4.bl.Array;

import java.util.List;
import java.util.Scanner;


public class Task4Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int[] values = new int[scanner.nextInt()];

        for (int i = 0; i < values.length; i++){
            System.out.print("value " + i + ": ");
            values[i] = scanner.nextInt();
        }

        List<Integer> indexes = Array.getIndexesOfPrimes(values);

        System.out.println("Found " + indexes.size() + " primes");
        for (Integer index : indexes){
            System.out.print("a[" + index + "]");
        }
    }

}
