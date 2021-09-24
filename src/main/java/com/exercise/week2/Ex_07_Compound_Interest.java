package com.exercise.week2;

import java.util.Scanner;

public class Ex_07_Compound_Interest {
    public static void main(String[] args) {
        double P, R,CI;
        int t,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        P = scanner.nextDouble();
        System.out.println("Enter the interest rate : ");
        R = scanner.nextDouble();
        System.out.println("Enter time of interest: ");
        n = scanner.nextInt();
        System.out.println("Enter time: ");
        t = scanner.nextInt();

        CI = P * Math.pow(1+(R/100/n), n*t) - P;
        System.out.println("Compound Interest is: " +CI+"$");

    }
}
