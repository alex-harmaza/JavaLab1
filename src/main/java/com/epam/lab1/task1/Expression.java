package com.epam.lab1.task1;


public class Expression {

    public static double consider(double x, double y){
        return (1 + Math.sin(x + y) * Math.sin(x + y))
                / (2 + Math.abs((x - (2 * x / (1 + x * x * y *y))))) + x;
    }

}
