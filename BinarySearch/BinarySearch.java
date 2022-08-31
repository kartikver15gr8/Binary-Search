package com.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 12, 45, 478, 977, 987};
        int target = 0;
        int ans = binarySearchAlgo(arr, target);
        System.out.println(ans);
    }

    // The below function will return the index of the target if it is there in the array
    static int binarySearchAlgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }return -1;
    }
}
