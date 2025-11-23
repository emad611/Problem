package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double d=sc.nextInt();
Complex complex=new Complex(a,b);
Complex complex1=new Complex(c,d);
Complex sum=complex.add(complex1);//انو هيجمع عناصر complex بالاضافة الى complex1
    Complex diff=complex.sub(complex1);//complex دا من هيطرحcomplex1
        Complex multi=complex.multiply(complex1);
        System.out.println("sum:"+sum);
        System.out.println("diff:"+diff);
        System.out.println("multi:"+multi);
    }
}
