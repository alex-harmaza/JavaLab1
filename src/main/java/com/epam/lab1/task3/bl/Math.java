package com.epam.lab1.task3.bl;

import com.epam.lab1.task3.entity.Segment;
import com.epam.lab1.task3.entity.Table;


public class Math {

    public static Table tan(Segment segment, double step){
        Table table = new Table();
        for (double i = segment.getBottomLine(); i <= segment.getUpperBound(); i += step){
            table.addLine(new double[]{i, java.lang.Math.tan(i)});
        }
        return table;
    }

}
