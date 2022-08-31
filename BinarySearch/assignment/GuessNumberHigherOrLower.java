package com.BinarySearch.assignment;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        int num = 10;
        int choose = 6;
        System.out.println(guessTheNumber(num, choose));
    }

    static int guessTheNumber(int num, int choose) {
        int start = 0;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (choose < mid) {
                System.out.println("-1");
                end = mid - 1;
            } else if (choose > mid) {
                System.out.println("+1");
                start = mid + 1;
            } else {
                return mid;
            }
        }return -1;
    }
}
