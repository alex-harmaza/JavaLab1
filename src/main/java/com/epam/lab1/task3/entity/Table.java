package com.epam.lab1.task3.entity;

import java.util.ArrayList;
import java.util.List;


public class Table {

    private List<double[]> data;


    public Table(){
        data = new ArrayList<double[]>();
    }

    public Table(double[][] data){
        this();
        for (double[] line : data){
            this.data.add(line);
        }
    }

    public Table(int lineCount, int columnCount){
        this();
        for (int i = 0; i < lineCount; i++){
            data.add(new double[columnCount]);
        }
    }


    public double getData(int x, int y){
        return data.get(x)[y];
    }

    public void setData(int x, int y, double value){
        data.get(x)[y] = value;
    }

    public List<double[]> getData(){
        return data;
    }

    public void setData(List<double[]> data){
        if (data == null){
            throw new IllegalArgumentException("Data is null");
        }
        this.data = data;
    }

    public void addLine(double[] line){
        data.add(line);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (data.size() == 0){
            builder.append("empty table");
        }
        else {
            for (double[] line : data){
                if (!"".equals(builder.toString())){
                    builder.append("\n");
                }
                for (int i = 0; i < line.length - 1; i++){
                    builder.append(line[i]).append("\t");
                }
                builder.append(line[line.length - 1]);
            }
        }
        return builder.toString();
    }
}
