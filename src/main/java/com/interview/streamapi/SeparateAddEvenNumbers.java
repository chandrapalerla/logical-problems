package com.interview.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SeparateAddEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(numbers)
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    }
}
