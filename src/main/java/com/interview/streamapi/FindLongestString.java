package com.interview.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestString {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps right over the little lazy dog.";
        String s1 = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(s1);
    }

}
