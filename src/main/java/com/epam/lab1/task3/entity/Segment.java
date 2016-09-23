package com.epam.lab1.task3.entity;


public class Segment {

    private double bottomLine;
    private double upperBound;


    public Segment(){}

    public Segment(double bottomLine, double upperBound){
        this.bottomLine = bottomLine;
        this.upperBound = upperBound;
    }


    public double getBottomLine() {
        return bottomLine;
    }

    public void setBottomLine(double bottomLine) {
        this.bottomLine = bottomLine;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }
}
