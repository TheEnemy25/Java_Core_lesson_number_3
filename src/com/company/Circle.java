package com.company;

public class Circle {

    private double radius;
    private double diameter;

    public Circle(){
        radius = 6.6;
        diameter = 5.5;
    }

    public Circle(double radius){
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double squareCircle(){
        double result = Math.PI * (radius*radius);
        return result;
    }

    public double lengthCircle(){
        double result = Math.PI*diameter;
        return result;
    }
}
