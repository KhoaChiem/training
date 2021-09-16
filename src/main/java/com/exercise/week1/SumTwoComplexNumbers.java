package com.exercise.week1;

public class SumTwoComplexNumbers {
    double real,img;

    SumTwoComplexNumbers(double a, double b) {
        this.real = a;
        this.img = b;
    }

    public static SumTwoComplexNumbers sum(SumTwoComplexNumbers c1 , SumTwoComplexNumbers c2) {
        SumTwoComplexNumbers temp = new SumTwoComplexNumbers(0, 0);
        temp.real = c1.real + c2.real;
        temp.img  = c1.img + c2.img;
        return temp;
    }

    public static void main(String[] args) {
        SumTwoComplexNumbers c1 = new SumTwoComplexNumbers(3.14,5.12);
        SumTwoComplexNumbers c2 = new SumTwoComplexNumbers(2.15,3.69);
        SumTwoComplexNumbers temp = sum(c1,c2);
        System.out.println("Complex number is: " + temp.real + "+" + temp.img + "i");
        System.out.println();
    }
}
