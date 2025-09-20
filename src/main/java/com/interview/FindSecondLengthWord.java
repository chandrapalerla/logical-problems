package com.interview;

import java.util.Arrays;
import java.util.Comparator;

/*
     //second highest length word
     // Out put: organization
 */
public class FindSecondLengthWord {
    public static void main(String[] args) {
        String s = "I am interested123455 to grow in my organization";

        String[] s1 = s.split(" ");
        Arrays.stream(s1).sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
