package com.aman.binarysearch;

// Find Smallest Letter Greater Than Target
public class CeilingLetter {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letters, target));
        
    }
        static char nextGreatestLetter(char[] letters, char target) {
        int st = 0;
        int end = letters.length-1;
        
        while(st<=end){
            int mid = st+(end-st)/2;
            if(letters[mid]>target)end=mid-1;
            else st=mid+1;
        }
        return letters[st%letters.length];
    }

}
