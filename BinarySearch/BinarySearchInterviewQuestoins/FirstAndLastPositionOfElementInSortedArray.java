package com.BinarySearch.BinarySearchInterviewQuestoins;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 10};
        int target = 9;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int start = 0;
        int end = arr.length - 1;
        int[] result = {-1, -1};
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                result[0] = mid;
                end = mid - 1;
            }
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else if (target == arr[mid]) {
                result[1] = mid;
                s = mid + 1;
            }
        }return result;
    }

}
