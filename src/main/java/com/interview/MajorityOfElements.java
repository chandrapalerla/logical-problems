package com.interview;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {
    static void main() {
        //int[] nums = {2, 2,3,3,1,2,4,5,2,3, 1, 1, 1, 2, 2};
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1};

        Map<Integer, Integer> numberWithCount = new HashMap<>();
        for (int num : nums) {
            if (numberWithCount.containsKey(num)) {
                numberWithCount.put(num, numberWithCount.get(num) + 1);
            } else {
                numberWithCount.put(num, 1);
            }
        }
        System.out.println(numberWithCount);
        int majarityElement = 0;
        int tempCount = 0;
        for (int num : numberWithCount.keySet()) {
            if (numberWithCount.get(num) > tempCount) {
                majarityElement = num;
                tempCount = numberWithCount.get(num);
            }
        }
        System.out.println(majarityElement);


        // uisng Boyer-Moore Voting Algorithm

        int count = 0;
        int candidate = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        System.out.println(candidate);
    }
}
