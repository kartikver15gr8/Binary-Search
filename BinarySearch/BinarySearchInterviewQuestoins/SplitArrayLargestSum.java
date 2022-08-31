package com.BinarySearch.BinarySearchInterviewQuestoins;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int m = 2;
        System.out.println(splitArrayLargestSum(arr, m));
    }

    static int splitArrayLargestSum(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int j : arr) {
            start = Math.max(start, j); // In the end of the loop this will come with the max value
            end += j;
        }

        // binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    // You cannot add this in this sub-array, this make new one
                    // Say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;     // Here start == end
    }
}
