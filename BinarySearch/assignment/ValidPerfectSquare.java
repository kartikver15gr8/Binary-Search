package com.BinarySearch.assignment;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 808201;
        System.out.println(validPerfectSquare(num));
    }

    static boolean validPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        long start = 1;
        long end = num;
        while (start < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid;
            }
        }
        return false;
    }
}
