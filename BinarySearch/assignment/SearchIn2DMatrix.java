package com.BinarySearch.assignment;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 10;
        boolean ans = searchInMatrix(matrix, target);
        System.out.println(ans);
    }

    static boolean searchInMatrix(int[][] matrix, int target) {
//        int row = 0;
//        int col = matrix[row].length - 1;
//        while (row < matrix.length && col > 0) {
//            if (target == matrix[row][col]) {
//                return true;
//            } else if (target < matrix[row][col]) {
//                col--;
//            } else {
//                row++;
//            }
//        }
//        return false;

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < matrix[i][mid]) {
                    end = mid - 1;
                } else if (target > matrix[i][mid]) {
                    start = mid + 1;
                } else {
                    return true;
                }
            }
        }return false;
    }


}
