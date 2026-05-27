package com.interview;

import java.util.Arrays;

public class SortZeroOne {
    static void main() {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }

            //swapping
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
