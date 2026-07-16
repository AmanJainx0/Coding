package com.aman.strings;

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if (palCheck(str)) {
            System.out.println("The given string is palindrome ");

        } else {
            System.out.println("The given string is not palindrome");
        }
    }

    public static boolean palCheck(String a) {
        int i = 0;
        int j = a.length() - 1;
        boolean ans = true;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                ans = false;
                break;
            } else {
                i++;
                j--;
            }
        }
        return ans;
    }
}
