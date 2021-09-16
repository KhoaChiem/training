package com.exercise.week1;
import java.util.Scanner;
public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        double multi;
        double i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        i = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        j = scanner.nextDouble();
        multi=i*j;
        System.out.println("Multiply of two numbers: " +multi);
    }
}
