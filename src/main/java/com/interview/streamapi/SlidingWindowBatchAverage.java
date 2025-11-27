package com.interview.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Gatherers;

public class SlidingWindowBatchAverage {
    void main() {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        List<Double> result = findAverage(arr, k);// Output: [2.2, 2.8, 2.8, 3.0, 2.8]
        System.out.println("Averages of subarrays of size " + k + " = " + result);

    }

    private List<Double> findAverage(int[] arr, int k) {
        return Arrays.stream(arr).boxed()
            .gather(Gatherers.windowSliding(5))
            .map(str->str.stream().mapToDouble(Integer::doubleValue).average().getAsDouble())
                .collect(Collectors.toList());
    }
}
