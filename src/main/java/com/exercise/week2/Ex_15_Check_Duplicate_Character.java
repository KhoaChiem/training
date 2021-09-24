package com.exercise.week2;

import java.util.Scanner;

public class Ex_15_Check_Duplicate_Character {

    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        char[] ch = string.toCharArray();
        System.out.println("Duplicate character are: ");

        for (int i = 0; i < string.length(); i++) {
            count = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = '0';
                }
            } if (count > 1 && ch[i] !='0') System.out.println(ch[i]);
        }
    }
}

