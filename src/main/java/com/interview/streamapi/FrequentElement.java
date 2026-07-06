package com.interview.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentElement {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple",
                "orange", "banana", "apple");

        String s = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();
        System.out.println(s);

        //Most frequent element + its count
        Map.Entry<String, Long> max = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(max.getKey() + " → " + max.getValue());

        //Top N most frequent elements
        List<String> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(2)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list1);
    }
}
