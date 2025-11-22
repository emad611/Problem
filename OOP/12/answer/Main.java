package com.java;
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Sides of the triangle: " + t.getSide1() + ", " + t.getSide2() + ", " + t.getSide3());
        System.out.println("Perimeter of the triangle: " + t.perimeter());
        System.out.println("Area of the triangle: " + t.area());

    }
}
