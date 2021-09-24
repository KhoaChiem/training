package com.exercise.week1;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        // Required switch case
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        i = scanner.nextInt();

        switch ((i%400 == 0) ? 0 : (i%4==0 && i%100!=0) ? 1 : 2) {
            case 0 : System.out.println("This is a leap year");
            break;
            case 1: System.out.println("This is a leap year");
            break;
            case 2: System.out.println("This is not a leap year");
            break;
        }

//        if(i%400 == 0 || (i%4==0 && i%100!=0)) {
//            System.out.println("This is a leap year");
//        } else {
//            System.out.println("This is not a leap year");
//        }
    }
}
