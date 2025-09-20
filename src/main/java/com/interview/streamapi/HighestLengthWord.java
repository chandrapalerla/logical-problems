package com.interview.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestLengthWord {
    public static void main(String[] args) {
        String s = "I am interested123455 to grow in my organization";

        String highestLengthString = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(highestLengthString);

        //second highest length word
        String secondHighestLengthWord = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighestLengthWord);

        String LowestLengthString = Arrays.stream(s.split(" "))
                .min(Comparator.comparing(String::length))
                .get();
        System.out.println(LowestLengthString);

        //second highest length word
        String secondLowestLengthWord = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length))
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLowestLengthWord);

        Map<Integer, List<String>> collect = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(Function.identity(), Collectors.toList())));

        System.out.println(collect);
    }
}
