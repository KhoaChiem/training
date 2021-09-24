package com.exercise.week2;

import java.util.Scanner;

public class Ex_13_Convert_UpperCase_To_Lowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >=65 && ch[i] <= 90) {
                ch[i] += 32;
            }
        } String string1 = String.valueOf(ch);
        System.out.println(ch);

        }
}

//        String string1 = string.toLowerCase();
//        System.out.println(string1);