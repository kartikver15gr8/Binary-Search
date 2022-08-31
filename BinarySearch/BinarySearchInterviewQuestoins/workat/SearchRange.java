package com.BinarySearch.BinarySearchInterviewQuestoins.workat;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int target = 4;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        int s = 0;
        int e = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                result[0] = mid;
                end = mid-1;
            }
        }while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                result[1] = mid;
                s = mid + 1;
            }
        }return result;
    }
}
