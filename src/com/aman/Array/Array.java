package com.aman.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int[] arr = new int[5];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = cs.nextInt();
            
        }
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
    }
}
