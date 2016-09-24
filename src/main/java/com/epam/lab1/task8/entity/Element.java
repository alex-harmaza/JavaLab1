package com.epam.lab1.task8.entity;


public class Element implements Comparable<Element> {

    private String mark;
    private double value;


    public Element(){}

    public Element(String mark, double value){
        this.mark = mark;
        this.value = value;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int compareTo(Element o) {
        if (this.value < o.value){
            return -1;
        }
        if (this.value > o.value){
            return 1;
        }
        return 0;
    }
}
