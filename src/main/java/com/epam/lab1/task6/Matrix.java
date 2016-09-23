package com.epam.lab1.task6;

import com.epam.lab1.task3.entity.Table;


public class Matrix {

    public static Table create(double[] values){
        if (values.length == 0){
            throw new IllegalArgumentException("Empty array 'values'");
        }

        Table table = new Table(values.length, values.length);
        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values.length; j++){
                table.setData(i, j, values[(i + j) % values.length]);
            }
        }
        return table;
    }
}
