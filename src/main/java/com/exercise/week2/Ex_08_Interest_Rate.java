package com.exercise.week2;

import java.util.Scanner;

public class Ex_08_Interest_Rate {
    public static void main(String[] args) {
        double P, IR;
        int R,T;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        P = scanner.nextDouble();
        System.out.println("Enter the interest rate : ");
        R = scanner.nextInt();
        System.out.println("Enter time: ");
        T = scanner.nextInt();

        IR = (P * R * T) /100;
        System.out.println("Interest Rate is: " +IR+"$");
    }
}
