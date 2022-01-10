package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.4,7.7);
        System.out.println("Площа прямокутника = " + rectangle.square());
        Rectangle perimeter = new Rectangle(12.4,7.7);
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
        Circle circle = new Circle(13.1);
        System.out.println("Площа кола = " + circle.squareCircle());
        System.out.println("Довжини кола = " + circle.lengthCircle());
    }
}
