package com.exercise.week3;

import java.util.Scanner;

public class Ex_19_Count_Times_Appear_Of_The_Char {
    public static void main(String[] args) {
        // Nhập chuỗi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        countTimes(string);
    }

    // aaa bbaa
    // a - 5; b - 2
    // Khai bao 1 mảng chứa cái chuỗi
    public static void countTimes(String s) {
        char[] array = s.toCharArray();
        char[] isDis = new char[s.length()]; // Mảng lưu kí tự đã từng xuất hiện
        int[] countT = new int[s.length()];
        boolean isDisplayed = false;
        for (int i = 0; i < array.length; i++) {   // Chạy hết cái mảng
            // Kí tự đã xuất hiện
            isDisplayed = check(array[i], isDis);  // Kiểm tra array thứ i có nằm trong mảng isDis hay ko
            if (isDisplayed) {
                int in = index(array[i], isDis);
                countT[in] += 1;
            }
            // Kí tự chưa xuất hiện
            if (!isDisplayed) {
                isDis[i] = array[i];
                countT[i] = 1;
            }
        }
        for (int i = 0; i < countT.length; i ++) {
            if (countT[i] == 0) {}
            else {
                System.out.print(isDis[i]);
                System.out.println(countT[i]);
            }
        }

    }

    public static int index(char x, char[] yn) { // Lấy vị trí xuất hiện của kí tự x trong mảng yn
        for (int i = 0; i < yn.length; i++) {
            if (yn[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static boolean check(char x, char[] yn) {
        for (int i = 0; i < yn.length; i++) {
            if (yn[i] == x) {
                return true;
            }
        }
        return false;
    }

}
