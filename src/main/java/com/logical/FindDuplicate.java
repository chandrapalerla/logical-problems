package com.logical;

public class FindDuplicate {


    static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate = " + findDuplicate(arr));   // 2

        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate = " + findDuplicate(arr2));  // 3
    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
