package com.exercise.week2;

import java.util.Scanner;

public class Ex_09_Find_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int Na = a/b;
        int Re = a%b;
        System.out.println("Natural part is: " +Na);
        System.out.println("Remainder part is: " +Re);
    }
}
