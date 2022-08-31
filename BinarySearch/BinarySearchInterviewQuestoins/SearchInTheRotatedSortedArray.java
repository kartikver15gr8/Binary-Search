package com.BinarySearch.BinarySearchInterviewQuestoins;

public class SearchInTheRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 9, 10, 1, 2, 5};
        int target = 10;
        System.out.println(searchInRotatedSortedArray(arr, target));
    }

    static int searchInRotatedSortedArray(int[] arr, int target) {
        int peak = peak(arr);
        int ans = binarySearch(arr, target, 0, peak);
        if (ans != -1) {
            return ans;
        } else {
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

