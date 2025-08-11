package com.arrays;

import java.util.*;

public class HasZeroSumSubarray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        if (hasZeroSumSubarray(nums)) {
            System.out.println("Subarray exists");
        } else {
            System.out.println("Subarray does not exist");
        }
        printAllSubArraysHasZeroSum(nums);
    }

    private static void printAllSubArraysHasZeroSum(int[] nums) {
        Map<Integer, List<Integer>> integerListHashMap= new HashMap<>();
        for(int i = 0; i<nums.length-1;i++){
            List<Integer> list =  new ArrayList<>();
            int sum = 0;
        }
    }

    private static boolean hasZeroSumSubarray(int[] nums) {
        // Using a HashSet to store the cumulative sum
        Set<Integer> set = new HashSet<>();
        int cumulativeSum = 0;

        for (int num : nums) {
            cumulativeSum += num;

            // Check if cumulative sum is zero or if it has been seen before
            if (set.contains(cumulativeSum)) {
                return true; // Found a subarray with zero sum
            }

            // Add the cumulative sum to the set
            set.add(cumulativeSum);
        }

        return false; // No subarray with zero sum found
    }
}
