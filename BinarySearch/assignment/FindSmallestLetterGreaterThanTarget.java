package com.BinarySearch.assignment;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'e', 'g', 'k', 't', 'y', 'z'};
        char target = 'z';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            /* The below code commented out is a solution of edge case, i.e,
            if the target element is greater or equal to the largest element in the array.
            in such case the code will return the element at first index which is the smallest one.*/


/*
            if (target >= arr[arr.length - 1]) {
                return arr[0];
            }
*/
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
