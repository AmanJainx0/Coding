package com.aman.recursion;

public class ContZero {
    public static void main(String[] args) {
        System.out.println(count(299050));
    }
    static int count(int n){
        return helper(n, 0);

    }
    static int helper(int n, int c){
    if(n == 0) return c;
    return helper(n / 10, (n % 10 == 0) ? c + 1 : c);
}
}
