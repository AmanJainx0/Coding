package com.aman.binarysearch;

public class Peak {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int st = 0;
        int en = arr.length-1;
        int ans = peak(arr, st, en);
        System.out.println(ans);
    }
    static int peak(int[] arr, int st, int en){
        while(st<=en){
            int mid = st+(en-st)/2;
            if(arr[mid]<arr[mid+1]) st =mid;
            else if(arr[mid]>arr[mid+1]) en = mid;
            
            return mid;
        }
        
         return -1;
    }
}
