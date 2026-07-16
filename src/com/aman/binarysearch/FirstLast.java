package com.aman.binarysearch;

// Given an array of integers nums sorted in non-decreasing(increasing) order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 7, 8, 8, 11};
        int target = 11;

        // first method
        int st = 0;
        int end = arr.length-1;
        int first = -1;
        int last = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target == arr[mid]){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else
                st=mid+1;
            
        }
        st=0;
        end=arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target == arr[mid]){
                last = mid;
                st = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else
                st=mid+1;
            
        }
        int[] ans = {0, 0};
        ans[0] = first;
        ans[1] = last;
        System.out.println(Arrays.toString(ans));


        // second method
        System.out.println(Arrays.toString(searchRange(arr, target)));


    }
        static  int[] searchRange(int[] arr, int target) {
        
           int[] ans = {-1, -1};

           // for finding the first index
            int start = search(arr, target, true); 

            // for finding the last index
            int end = search(arr, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;
    }


    // for finding the indexes
    static int search(int[] arr, int target, boolean find){
        int ans = -1;
        int st =0;
        int end =arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>target) end = mid-1;
            else if(arr[mid]<target) st = mid+1;
            else{
                ans = mid;

                // if the element before the mid index is = to the target 
                if(find){
                    end = mid-1;
                }
                // if the element after the mid index is equal to the target
                else{
                    st =mid+1;
                }
            }
        }
        return ans;
    }
}
