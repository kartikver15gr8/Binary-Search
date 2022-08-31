package com.BinarySearch.BinarySearchInterviewQuestoins;

import java.util.Arrays;

public class FindInMountainArrayWithDuplicateElements {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 5, 8, 9, 10, 4, 3, 2, 1, 0};
        int target = 1;
        int[] ans = findRange(array, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findRange(int[] arr, int target) {
        int[] result = {-1, -1};
        int peak = peak(arr);
        int searchInDes = orderAgnosticBS(arr, target, peak, arr.length - 1);
        int searchInAsc = orderAgnosticBS(arr, target, 0, peak);
        if (searchInAsc != -1) {
            result[0] = searchInAsc;
        }
        if (searchInDes != -1) {
            result[1] =searchInDes;
        }return result;
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {   // If array is sorted in ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {  // If array is sorted in descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
