package com.java;

public class Triangle {
    private final int side1=3;
    private final int side2=4;
    private final int side3=5;
    private final float base=3;
    private final float height=4;

    public int getSide1() {
       return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }
    
    public  int perimeter(){
        System.out.println("perimeter ");
        return side1+side2+side3;
    }
    public float area(){
        System.out.println("The area of the triangle is ");
        return 0.5f*base*height;
    }
}
