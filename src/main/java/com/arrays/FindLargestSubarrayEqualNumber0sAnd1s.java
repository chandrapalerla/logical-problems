package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindLargestSubarrayEqualNumber0sAnd1s {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 1, 0, 0};
        findLargestSubarray(nums);
    }

    private static void findLargestSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLength = 0;
        int startIndex = -1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                if (length > maxLength) {
                    maxLength = length;
                    startIndex = map.get(sum) + 1;
                }
            } else {
                map.put(sum, i);
            }
        }

        if (maxLength > 0) {
            System.out.println("Largest subarray with equal number of 0s and 1s found from index " + startIndex + " to " + (startIndex + maxLength - 1));
        } else {
            System.out.println("No subarray with equal number of 0s and 1s found.");
        }
    }
}
