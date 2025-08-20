package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumLengthSubarrayGivenSum {
    public static void main(String[] args) {
        int[] nums = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int target = 8;
        //Brute force approach
        findMaxLenSubarray(nums, target);
        //Optimized approach using HashMap
        findMaxLenSubarrayOptimized(nums, target);
    }

    //using hashmap time complexity O(n) space complexity O(n)
    private static void findMaxLenSubarrayOptimized(int[] nums, int target) {
        int maxLength = 0;
        int endingIndex = -1;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == target) {
                maxLength = i + 1;
                endingIndex = i;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - target)) {
                int length = i - map.get(sum - target);
                if (length > maxLength) {
                    maxLength = length;
                    endingIndex = i;
                }
            }
        }

        if (endingIndex != -1) {
            System.out.println("[" + (endingIndex - maxLength + 1) + ", " + endingIndex + "]");
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }

    //time complexity O(n^2) space complexity O(1)
    private static void findMaxLenSubarray(int[] nums, int target) {
        int len = 0;
        int ending_index = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    if (len < j - i + 1) {
                        len = j - i + 1;
                        ending_index = j;
                    }
                }
            }
        }
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
    }
}
