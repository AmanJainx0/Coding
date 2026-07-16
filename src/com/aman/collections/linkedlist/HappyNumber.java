package com.aman.collections.linkedlist;

import java.util.Scanner;

public class HappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int findSquare(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        HappyNumber obj = new HappyNumber();

        if (obj.isHappy(n)) {
            System.out.println("The given number is a happy number.");
        } else {
            System.out.println("The given number is not a happy number.");
        }

        sc.close();
    }
}