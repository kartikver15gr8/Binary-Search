package com.BinarySearch.assignment;

public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {0, 4, 3, 0, 4};
        System.out.println(specialArray(arr));
    }

    static int specialArray(int[] arr) {
        int count = 0;
        int n = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        while (n <= max) {
            for (int j : arr) {
                if (n <= j) {
                    count++;
                }
            }
            if (n == count) {
                return n;
            } else {
                count = 0;
                n++;
            }
        }return -1;

    }
}
