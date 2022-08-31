package com.BinarySearch.assignment;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {11, 13, 15, 17};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[0] < arr[arr.length - 1]) {
            return arr[0];
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } return -1;
    }
}
