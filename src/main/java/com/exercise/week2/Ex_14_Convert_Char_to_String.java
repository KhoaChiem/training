package com.exercise.week2;

import java.util.Scanner;

public class Ex_14_Convert_Char_to_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chars: ");
        Character ch = scanner.next().charAt(0);

        String string = String.valueOf(ch);
        String string1 = Character.toString(ch);
        System.out.println(string);
        System.out.println(string1);
        }
}

