package com.aman.binarysearch;

// find the index of the maximum element in the array after which the elements start decreasing (1, 3, 6, 10, 15, 13, 9, 4, 2)

// also known as BITONIC Arrays
public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0, 1, 3, 5, 9, 10, 8, 5, 2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are on the decreasing part, means we have to move left for the largest element
                // also it could be the largest but we have to check complete array
                end=mid;
            }
            else{
                // we have to move right for the largest element 
                start=mid+1;
            }
        }
        // at last our start and end both will be pointing to the index of the largest element after passing through the above 2 mentioned conditions
        // return either of the variables
        return start;
    }
}
