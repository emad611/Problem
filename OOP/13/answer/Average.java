package com.java;

public class Average {
    private int num1;
    private int num2;
    private int num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public void average() {
        System.out.println("Average is ");
        System.out.println((num1+num2+num3)/3);
    }
}
