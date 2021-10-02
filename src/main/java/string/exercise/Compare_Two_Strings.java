package java.string.exercise;

import java.util.Scanner;

public class Compare_Two_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second String: ");
        String string2 = scanner.nextLine();

        int result = string1.compareTo(string2);
        if (result<0) {
            System.out.println("String " + string1 + " < " + string2);
        } else if (result > 0) {
            System.out.println("String " + string1 + " > " + string2);
        } else  {
            System.out.println("String " + string1 + " = " + string2);
        }
        }
}
