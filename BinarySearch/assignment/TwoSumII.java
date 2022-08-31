package com.BinarySearch.assignment;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // The below solution is by using binary search.
    static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        if (arr == null || arr.length == 0)
//            return null;
        while (start < end) {
            int x = arr[start] + arr[end];
            if (x < target) {
                start++;
            } else if (x > target) {
                end--;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }
        return null;
    }

    // The below solution is by using linear search.
    /*
    static int[] twoSum(int[] arr, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i+1;
                    result[1] = j + 1;
                }
            }
        }return result;
    }
    */
}
