package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    static void main() {
        int nums[] = {3,2,4};
        int target = 6;
        int a[] = twoSum(nums, target);
        System.out.printf(a[0] +","+ a[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        Map<Integer, Integer> valueIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (i!=valueIndex.getOrDefault(diff,0) &&valueIndex.containsKey(diff)) {
                a[0] = i;
                a[1] = valueIndex.get(diff);
                break;
            } else {
                valueIndex.put(nums[i], i);
            }
        }
        return a;
    }
}
