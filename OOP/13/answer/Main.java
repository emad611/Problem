package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a first number");
        int num1=sc.nextInt();
        System.out.println("pls enter a second number");
        int num2=sc.nextInt();
        System.out.println("pls enter a third number");
        int num3=sc.nextInt();
        Average avg=new Average(num1,num2,num3);
        avg.average();

    }
}
