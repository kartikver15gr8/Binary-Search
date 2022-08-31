package com.BinarySearch.assignment;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = in.nextInt();
        System.out.println(sqrt(num));
    }

    static int sqrt(int num) {
        int left=1,right =num, result=0;
        while(left<right){
            int mid = left + (right - left)/2;
            if(mid<num/mid){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return (left==num/left)?left:left-1;
    }
}
