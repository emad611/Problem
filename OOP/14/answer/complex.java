package com.java;

public class Complex {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
return new Complex(
    this.real + complex.real,
    this.imaginary+complex.real
);
    }
    public Complex sub(Complex complex) {
        return new Complex(
          this.real-complex.real,
          this.imaginary-complex.imaginary
        );
    }
    //هنا مفيش operator overloading ف عملنا كدا بنعرف الدالة من نفس نوع الكلاس ونرجع new+class على كل العمليات
    public Complex multiply(Complex complex) {
        double imagepart=this.real* complex.imaginary+this.imaginary* complex.real;
        double realpart=this.real* complex.real-this.imaginary*complex.imaginary;
        return new Complex(realpart,imagepart);
    }

    @Override
    //دى لطباعة الاوبجكت بشكل مفهوم بدلا من طباعة موقعه فى الذاكرة
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
