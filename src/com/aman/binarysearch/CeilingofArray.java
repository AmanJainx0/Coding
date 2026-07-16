package com.aman.binarysearch;

// ceiling is the smallest element in the array that is (>=) to the target
public class CeilingofArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12, 13, 15, 18};
        int target = 11;
        int st = 0;
        int en = arr.length-1;
        int ans = ceiling(arr, target, st, en);
        System.out.println(arr[ans]);
    }
    static int ceiling(int[] arr, int target, int st, int en){
        if(target>arr[en]) return -1;
        while(st<=en){
            int mid = st+(en-st)/2;
            if(target<arr[mid]) en=mid-1;
            else if(target>arr[mid]) st=mid+1;
            else return mid;
        }
        
         return st;
        
        
    }
}
