package com.aman.binarysearch;

// floor is the greatest no. that is (<=) to the target
public class Floor {
    public static void main(String[] args) {
       int[] arr = {2, 4, 8, 10, 12, 13, 15, 18};
        int target = 11;
        int st = 0;
        int en = arr.length-1;
        int ans = floor(arr, target, st, en);
        System.out.println(arr[ans]);
    }
    static int floor(int[] arr, int target, int st, int en){
        if (target < arr[0]) return -1;
        if(target>arr[en]) return en;
        while(st<=en){
            int mid = st+(en-st)/2;
            if(target==arr[mid]) return mid;
            else if(target>arr[mid]) st=mid+1;
            else en = mid-1;
        }
        return en;
    }
}
