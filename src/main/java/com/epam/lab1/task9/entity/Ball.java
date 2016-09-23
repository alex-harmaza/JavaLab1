package com.epam.lab1.task9.entity;


public class Ball {

    private double weight;
    private Color color;


    public Ball(double weight, Color color){
        setColor(color);
        setWeight(weight);
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0){
            throw new IllegalArgumentException("Incorrect weight");
        }
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null){
            throw new IllegalArgumentException("Color is null");
        }
        this.color = color;
    }
}
