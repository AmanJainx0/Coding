package com.aman.recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,78,64,76,43 };
        bs(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bs(int[] arr, int s, int e){
        if(s==0){
            return;
        }
        if(e<s){
            if(arr[e]>arr[e+1]){
                int temp  = arr[e];
                arr[e] = arr[e+1];
                arr[e+1] = temp;
            }
            bs(arr, s, e+1);    
        } else{
            bs(arr, s-1, 0);
        }
    }
}
