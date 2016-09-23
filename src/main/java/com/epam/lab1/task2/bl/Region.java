package com.epam.lab1.task2.bl;

import com.epam.lab1.task2.entity.Point;


public class Region {

    public static boolean isInclude(Point point){
        double x = point.getX();
        double y = point.getY();
        boolean result = false;

        if (y > 0.0){
            if (y < 5.0 || y == 5.0){
                if ((x > -4.0 || x == -4.0)&& (x < 4.0 || x == 4.0)){
                    result = true;
                }
            }
        }
        else if (y > -3.0 || y == -3.0){
            if ((x > -6.0 || x == -6.0)&& (x < 6.0 || x == 6.0)){
                result = true;
            }
        }

        return result;
    }

}
