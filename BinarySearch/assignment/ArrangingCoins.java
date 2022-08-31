package com.BinarySearch.assignment;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoin(n));
    }

    static int arrangeCoin(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n >= 0) {
                n = n - i;
                count++;
            }
        }return count;
    }
}
