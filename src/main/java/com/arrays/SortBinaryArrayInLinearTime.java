package com.arrays;

public class SortBinaryArrayInLinearTime {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
        //sortBinaryArrayCountingZeros(arr);
        //sortBinaryArrayWithOutCountingZeros(arr);
        sortBinaryArrayUsingTwoPointers(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sortBinaryArrayUsingTwoPointers(int[] arr) {
        //time complexity O(n) space complexity O(1)
        //Using two pointers to sort the binary array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Move left pointer until we find a 1
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right pointer until we find a 0
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap the elements at left and right pointers
            System.out.println("left: " + left + " right: " + right);
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    private static void sortBinaryArrayWithOutCountingZeros(int[] arr) {
        //time complexity O(n) space complexity O(1)
        //Using a single pointer to sort the binary array
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                arr[k] = 0;
                k++;
            }
        }
        System.out.println("Number of Zeros: " + k);
        //Fill the remaining array with ones
        for (int j = k; j < arr.length; j++) {
            arr[j] = 1;
        }
    }

    private static void sortBinaryArrayCountingZeros(int[] arr) {
        //time complexity O(n) space complexity O(1)
        //Using counting sort to sort the binary array
        //Count the Number of Zeros
        int zerosCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zerosCount++;
            }
        }
        System.out.println("Number of Zeros: " + zerosCount);
        //Fill the array with zeros
        for (int i = 0; i < zerosCount; i++) {
            arr[i] = 0;
        }
        //Fill the remaining array with ones
        for (int i = zerosCount; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
