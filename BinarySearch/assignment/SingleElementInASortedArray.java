package com.BinarySearch.assignment;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 7, 8, 8};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(mid %2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            }else {
                if(arr[mid] == arr[mid-1]){
                    start =mid+1;
                } else{
                    end = mid;
                }
            }
        }
        return arr[start];
    }
}
