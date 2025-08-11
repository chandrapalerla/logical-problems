package com.arrays;

/*Findpair with given sum in the array
Input: nums = [8, 7, 2, 5, 3, 1]target = 10
Output: Pair found (8, 2)orPair found (7, 3)*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPair {
    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};

        findPairsBruteforce(nums);
        findPairsHighLow(nums);
        findPairsHashMap(nums);
    }

    //Optimized approach time complexity O(nlogn) space complexity O(1)
    //Using two pointers after sorting the array, this approach is more efficient
    private static void findPairsHighLow(int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == 10) {
                System.out.println("Pair found (" + nums[low] + ", " + nums[high] + ")");
                low++;
                high--;
            } else if (sum < 10) {
                low++;
            } else {
                high--;
            }
        }
    }

    //Brute force approach time complexity O(n^2) space complexity O(1)
    private static void findPairsBruteforce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == 10) {
                    System.out.println("Pair found (" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }
    }

    // time complexity O(n) space complexity O(n)
    private static void findPairsHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = 10 - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair found (" + num + ", " + complement + ")");
            }
            map.put(num, 1);
        }
        System.out.println(map);
    }
}
