package com.aman.recursion;

public class TargetElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,90};
        System.out.println(find(arr, 10, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(arr[index]==arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
}
