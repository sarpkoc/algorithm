package com.leetcode.easy;

//leetcode #204
public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes primes = new CountPrimes();
        System.out.println(primes.countPrimes(10));
    }

    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++){
            if (notPrimes[i] == false){
                count++;
                for (int j = 0; j*i < n; j++) {
                    notPrimes[i*j] = true;
                }
            }
        }

        return count;
    }
}
