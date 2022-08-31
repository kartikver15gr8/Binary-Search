package com.BinarySearch.BinarySearchInterviewQuestoins;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9, 4, 0};
        int target = 9;
        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] arr, int target) {
        int peak = peak(arr);
        int searchInAsc = orderAgnosticBS(arr, target, 0, peak);
        if (searchInAsc != -1) {
            return searchInAsc;
        } else {
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
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



