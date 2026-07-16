package com.aman.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {54, 10, 21, 0, 25, 41, 3, 9, 11, 52};
        for(int i =1;i<arr.length;i++){
            int value = arr[i];
            int j;
             for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
            }

            
            arr[j + 1] = value;
        }
        System.out.println(Arrays.toString(arr));

    }
}
