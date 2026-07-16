package com.aman.maths;

public class HCF_GCD {

    public static void main(String[] args) {
        System.out.println(gcd(10, 120));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}