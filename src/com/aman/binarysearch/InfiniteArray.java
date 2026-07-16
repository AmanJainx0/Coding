package com.aman.binarysearch;

// Find the number in the sorted array of infinite numbers(array of infinite length)  for infinite suppose we can't use arr.length
public class InfiniteArray {
    public static void main(String[] args) {
        // it might throw exception of array index out of bound due to the pressence of insufficient elements in the array.
        int arr[] = {2, 5, 6, 8, 10, 15, 18, 19, 21, 23, 25, 30, 35, 39, 40};
        int target = 19;
        System.out.println(findRange(arr, target));
    }
    static int findRange(int arr[], int target){
        int start = 0;
        int end = 1;

        
        while(target>arr[end]){
            // doubling the size of search area 
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
        
    }
    static int binarySearch(int arr[], int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
             return mid;
            }
        }
        return -1;
    }
}