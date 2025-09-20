package com.interview.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(common); // [3, 4]
    }
}
