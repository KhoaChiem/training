package com.exercise.week1;
import java.util.Scanner;
public class SumTwoNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        i = scanner.nextInt();
        System.out.println("Enter the second number: ");
        j = scanner.nextInt();
        sum=i+j;
        System.out.println("Sum of two numbers: " +sum);
    }
}
