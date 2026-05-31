package com.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GroupAnagram {
    static void main() {
        String[] arr = {"java", "epam", "pame", "aepm", "avja", "xyz", "kile", "like"};
        Arrays.stream(arr).collect(Collectors.groupingBy(word -> {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        })).values().forEach(System.out::println);
    }
}
