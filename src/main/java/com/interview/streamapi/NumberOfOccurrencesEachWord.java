package com.interview.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrencesEachWord {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps right over the little lazy dog little";

        //TODO Find number of occurrences  word
        Map<String, Long> collect = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        //TODO Find words owel length is 2
        Arrays.stream(input.split(" "))
                .filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);

        List<Integer> intList= Arrays.asList(2,3,4,5,6,7,8,9,10);
        //TODO Given a list of integers, divide into two lists one having even numbers and other having odd numbers
        ArrayList<List<Integer>> lists = new ArrayList<>(intList.stream()
                .collect(Collectors.groupingBy(key -> key % 2 == 0, Collectors.toList()))
                .values());
        System.out.println(lists);

    }
}
