package com.BinarySearch.assignment;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3},
        };
        System.out.println(countNegatives(matrix));
    }

    static int countNegatives(int[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
