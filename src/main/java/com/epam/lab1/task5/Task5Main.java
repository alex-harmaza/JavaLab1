package com.epam.lab1.task5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task5Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the count: ");
            int[] sequence = new int[scanner.nextInt()];

            for (int i = 0; i < sequence.length; i++){
                System.out.print("Value " + i + ": ");
                sequence[i] = scanner.nextInt();
            }

            int result = Sequence.getMinDeleteCountForRisingSequence(sequence);
            if (result == -1){
                System.out.println("Result: increasing sequence not in data");
            }
            else {
                System.out.println("Result: " + result);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Error: incorrect value");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Error: negative size");
        }
        finally {
            scanner.close();
        }
    }

}
