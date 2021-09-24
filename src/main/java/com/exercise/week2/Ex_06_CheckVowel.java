package com.exercise.week2;

import java.util.Scanner;

public class Ex_06_CheckVowel {
    public static void main(String[] args) {
        // Requires not using the command Break
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char character = scanner.next().charAt(0);

        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }

        if (isVowel == true) {
            System.out.println("This is a vowel");
        } else {
            if (character > 'a' && character < 'z' || character > 'A' && character < 'Z') {
                System.out.println("This is consonants");
            } else {
                System.out.println("This is not alphabet");
            }
        }
    }
}
