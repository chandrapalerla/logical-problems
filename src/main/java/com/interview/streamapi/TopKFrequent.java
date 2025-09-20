package com.interview.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,3,4,4);
        int k = 2;

        List<Integer> result = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result); // [1, 2]

    }
}
