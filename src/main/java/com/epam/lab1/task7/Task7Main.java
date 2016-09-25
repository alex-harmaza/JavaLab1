package com.epam.lab1.task7;

import com.epam.lab1.task3.entity.Table;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by alexh on 22.09.2016.
 */
public class Task7Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the count: ");
            double[] array = new double[scanner.nextInt()];

            for (int i = 0; i < array.length; i++){
                System.out.print("Value " + i + ": ");
                array[i] = scanner.nextDouble();
            }

            ShellSort.execute(array);
            System.out.println("Result:\n" + new Table(new double[][]{array}));
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
