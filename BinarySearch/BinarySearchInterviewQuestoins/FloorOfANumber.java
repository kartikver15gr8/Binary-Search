package com.BinarySearch.BinarySearchInterviewQuestoins;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 45, 78, 89, 97, 99, 100};
        int target = 98;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // If the target is smaller than the smallest element of the array
        if (target < arr[0]) {
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
        }
        return end;
    }
}
