package com.exercise.week2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_11B_Uppercase_First_Char_Of_Each_Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        String[] sep = string.split(" ");
        for (int i = 0; i< sep.length; i ++) {
            sep[i] = Character.toUpperCase(sep[i].charAt(0)) + sep[i].substring(1);
        }
        System.out.println(String.join(" ", sep));
    }
}
