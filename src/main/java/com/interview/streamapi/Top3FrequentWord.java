package com.interview.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWord {
    public static void main(String[] args) {
        List<String> sentence = List.of("java is awesome","i love java","java stream Api is powerful","I love to use Stream");
        // find the top 3 frequent words goes here
        sentence.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(System.out::println);
    }
}
