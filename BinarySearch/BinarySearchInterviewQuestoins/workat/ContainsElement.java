package com.BinarySearch.BinarySearchInterviewQuestoins.workat;

public class ContainsElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int target = 6;
        boolean ans = containsElement(arr, target);
        System.out.println(ans);
    }

    static boolean ascOrDes(int[] arr) {
        return arr[arr.length - 1] > arr[0];
    }
    static boolean containsElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return true;
            }

            if (ascOrDes(arr)) {   // If array is sorted in ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else {  // If array is sorted in descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }return false;
    }
}
