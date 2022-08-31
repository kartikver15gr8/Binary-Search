package com.BinarySearch.assignment;

public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(doubleExists(arr));
    }

    static boolean doubleExists(int[] arr) {
        boolean ans = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    ans = true;
                    break;
                }
            }
        }return ans;
    }
}
