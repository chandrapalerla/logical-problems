package com.interview.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class FindTheMaximumNumberOfOvals {
    public static void main(String[] args) {
        String str = "The quick browaeion fox jumps right over the little lazy dog.";

        String s = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(FindTheMaximumNumberOfOvals::countVowels))
                .orElse("");

        System.out.println(s);

        String minOvelString = Arrays.stream(str.split(" "))
                .min(Comparator.comparingInt(FindTheMaximumNumberOfOvals::countVowels)).orElse("");
        System.out.println(minOvelString);

    }

    public static int countVowels(String word) {
        return (int) word.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "AEIOUaeiou".contains(String.valueOf(ch)))
                .count();
    }
}
