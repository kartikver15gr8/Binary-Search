package com.BinarySearch.BinarySearchInterviewQuestoins;

public class RotatedCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int[] arr) {
        int pivotIndex = pivot(arr);
        return pivotIndex+1;
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        } return -1;
    }
}




