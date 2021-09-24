package com.exercise.week2;

import java.util.Scanner;

public class Ex_11A_Uppercase_First_Char {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        String cap = string.substring(0,1).toUpperCase() + string.substring(1);
        System.out.println("Char at index is: " +cap);
    }
}
