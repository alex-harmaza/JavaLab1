package com.epam.lab1.task7;


public class ShellSort {

    public static void execute(double[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i + 1]){
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = (i - 1 < 0) ? 0 : i - 1;
            }
            else {
                i++;
            }
        }
    }

}
