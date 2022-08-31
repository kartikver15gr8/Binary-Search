package com.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 19, 98, 987, 1000};
        int target = 19;
        System.out.println(orderAgnosticBS(arr,target));
    }


    /* The below is the function that will check whether the array is sorted in ascending manner or descending manner.
    * If the array is sorted in the ascending order then the function "checkAscOrDes" will return true, else will return
    * false.*/
    static boolean checkAscOrDes(int[] arr, int target) {
        return arr[0] < arr[arr.length - 1];    // If this condition is true then this means that the array is sorted in ascending order.
    }

    /* The below is the function "orderAgnosticBS" that uses the above function "checkAscOrDes" to find the target element
    * int the array sorted in ascending order and descending order as well*/
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (checkAscOrDes(arr, target)) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }return -1;
    }

    // The below function is order agnostic binary search and it is useful to find whether the target element exists in the ascending sorted array and descending sorted array as well!

//    static int orderAgnosticBS(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target == arr[mid]) {
//                return mid;
//            }
//            else if (arr[0] < arr[arr.length - 1]) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    return mid;
//                }
//            } else {
//                if (target < arr[mid]) {
//                    start = mid + 1;
//                } else if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    return mid;
//                }
//            }
//        }return -1;
//    }
}
