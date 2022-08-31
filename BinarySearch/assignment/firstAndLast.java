package com.BinarySearch.assignment;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 22, 22, 22, 22, 22, 88, 88, 88, 88, 88, 97, 97, 97, 97, 100};
        int target = 97;
        int[] ans = firstAndLastIndex(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstAndLastIndex(int[] arr, int target) {
        int[] result = {-1, -1};
        int start = 0;
        int s = 0;
        int end = arr.length - 1;
        int e = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                result[0] = mid;
                end = mid - 1;
            }
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                result[1] = mid;
                s = mid + 1;
            }
        }
        return result;
    }
}
