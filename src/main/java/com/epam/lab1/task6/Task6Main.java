package com.epam.lab1.task6;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Task6Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the count: ");
            double[] values = new double[scanner.nextInt()];

            for (int i = 0; i < values.length; i++){
                System.out.print("Value " + i + ": ");
                values[i] = scanner.nextDouble();
            }

            System.out.println("Result:\n" + Matrix.create(values));
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
