package com.exercise.week1;
import java.util.Scanner;
public class CheckNumberParity {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        i = scanner.nextInt();

        if(i%2 == 0) {
            System.out.println("The number is an even");
        } else {
            System.out.println("The number is an odd");
        }
    }
}
