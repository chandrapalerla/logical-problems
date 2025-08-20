package com.arrays;

import java.util.stream.IntStream;

public class FindDuplicate {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5,}; // Example array with a duplicate
//        System.out.println(hasDuplicate(arr));

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int size = arr.length;
        int[] output = new int[size];
        int j = 0;
        for(int i = 0 ; i< size ; i++){
            if(arr[i] != 0){
                output[j] = arr[i];
                j++;
            }
        }
        for(int num: output){
            System.out.print(num + " ");
        }
    }

    private static int hasDuplicate(int[] arr) {
        int actual_sum = IntStream.of(arr).sum();
        int expected_sum = arr.length * (arr.length - 1) / 2;
        return actual_sum - expected_sum;
    }
}