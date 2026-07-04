package com.interview.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsContinuesSorting {
    static void main(){
        List<String> words = List.of(
                "ab",
                "ba",
                "bc",
                "cd"
        );

        List<String> collect = words.stream()
                .map(w -> Arrays.stream(w.split("")).sorted(String::compareTo)
                .collect(Collectors.joining()))
                .distinct()
                .toList();
        System.out.println(collect);
    }
}
