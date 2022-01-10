package com.company;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 6.6;
        width = 5.5;
    }

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double square (){
        double result = length * width;
        return result;
    }

    public double perimeter(){
        double result = 2*(length + width);
        return result;
    }
}
