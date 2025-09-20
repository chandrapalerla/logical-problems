package com.interview.streamapi;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElementPrintSmallLength {
    public static void main(String[] args) {
        String arr1[]     = {"apple", "banana"};
        String arr2[]     = {"kiwi", "grape", "banana", "apple"};

        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        String combinedStream = Stream.concat(stream1, stream2).distinct()
                .sorted(Comparator.comparing(String::length))
                .limit(1)
                .collect(Collectors.joining(", "));
        System.out.println("Combined Stream ::" + combinedStream);
    }
}