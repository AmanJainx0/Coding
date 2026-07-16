package com.aman.recursion;

public class Bs {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 10;
        System.out.println(bs(arr, target));
    }

    private static int bs(int[] arr, int target) {
       return search(arr, target, 0, arr.length-1);
    }

    private static int search(int[] arr, int target, int i, int j) {
        if(i>j)return -1;
        int mid = i + (j-i)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return search(arr, target, i, mid-1);
        else return search(arr, target, mid+1, j);
    }

}
