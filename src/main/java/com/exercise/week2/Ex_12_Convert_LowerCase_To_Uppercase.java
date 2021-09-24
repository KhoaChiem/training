package com.exercise.week2;

import java.util.Scanner;

public class Ex_12_Convert_LowerCase_To_Uppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>=97 && ch[i] <=122) {
                ch[i] -=  32;
            }
        } String string1 = String.valueOf(ch);
        System.out.println(string1);
    }
}


//        String string1 = string.toUpperCase();
//        System.out.println(string1);