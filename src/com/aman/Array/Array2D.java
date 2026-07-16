package com.aman.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter array Elemnts: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int[] p : arr) {
            System.out.println(Arrays.toString(p));
        }
        // System.out.println(Arrays.toString(arr));
        int[][] arr1 = new int[3][3];
        System.out.println("Enter array Elemnts: ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = sc.nextInt();
            }
        }
        for (int[] p : arr1) {
            System.out.println(Arrays.toString(p));
        }

    }

}
