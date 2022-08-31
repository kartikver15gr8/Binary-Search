package com.BinarySearch.assignment;

public class SearchInARotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if (nums[start] < nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[start] > nums[mid]) {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start++;
            }
        }

        return false;
    }
}
