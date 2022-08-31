package com.BinarySearch.assignment;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start = 0;
        int sum1 = 0;
        int sum2 = 0;
        int end1 = nums1.length - 1;
        int end2 = nums2.length - 1;
        while (start <= end1) {
            sum1 = nums1[start] + nums1[end1];
            start++;
            end1--;
        }
        start = 0;
        while (start <= end2) {
            sum2 = nums2[start] + nums2[end2];
            start++;
            end2--;
        }
        return (double) (sum1 + sum2) / (nums1.length + nums2.length);
    }

}
