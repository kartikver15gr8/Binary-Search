package com.BinarySearch.BinarySearchInterviewQuestoins;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 68, 87, 97, 99, 101};
        int target = 101;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // If the target is greater than the largest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }return start;
    }
}
