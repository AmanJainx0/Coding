package com.aman.maths;

public class Seive {
    public static void main(String[] args) {
        int n = 10;
        boolean [] pri = new boolean[n+1];
        seive(n, pri);
    }
    // false means the number is prime...
    // this is called as Seive of Eratosthenes
    static void seive(int n, boolean[] pri){
        for(int i=2; i*i<=n; i++){
            if(!pri[i]){
                for(int j = i*2; j<=n; j += i){
                    pri[j] = true;
                }
            }
        }
        for(int i = 2; i<=n; i++){
            if(!pri[i]){
                System.out.println(i);
            }
        }
    }
    
}
