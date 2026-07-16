package com.aman.binarysearch;

public class RotatedArray {
    public static void main(String[] args) {
        String s = " Hello  World Aman";
        String[] arr = s.split(" ");
         String ns = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ns =ns+ arr[i];
                ns=ns+" ";
            if(i!=0){
                ns+=" ";
            }
            
            
            
        }
        System.out.println(ns);
    }
}
