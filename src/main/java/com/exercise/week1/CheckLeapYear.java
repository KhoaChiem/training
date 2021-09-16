package com.exercise.week1;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        i = scanner.nextInt();

        if(i%400 == 0) {
            System.out.println("This is a leap year");
        } else if (i%4==0 && i%100!=0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
