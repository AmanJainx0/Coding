package com.aman.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 18;
        int beg = 0;
        int end = arr.length-1;
        int ans = search(arr, target, beg, end);
        System.out.println(ans);

    }
    static int search(int[] arr, int target, int beg, int end){
        int mid = beg+(end-beg)/2;
        if(beg>end){
            return -1;
        }
        if(target==arr[mid])
        {return mid;
        }
        else if(target <arr[mid]){
            return search(arr, target, beg, mid-1);
        }
        else{
           return search(arr, target, mid+1, end);
        }
        
    }
}
