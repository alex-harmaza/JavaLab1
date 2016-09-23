package com.epam.lab1.task4.bl;

import java.util.ArrayList;
import java.util.List;


public class Array {
    public static List<Integer> getIndexesOfPrimes(int[] values){
        if (values.length == 0){
            throw new IllegalArgumentException("Empty array 'values'");
        }

        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++){
            boolean isPrime = false;
            if (values[i] == 2 || values[i] == 3){
                isPrime = true;
            }
            else {
                for (int j = 2; j * j <= values[i]; j++){
                    if (values[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                    isPrime = true;
                }
            }
            if (isPrime){
                indexes.add(i);
            }
        }
        return indexes;
    }
}
