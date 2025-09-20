package com.interview.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListDividedToEvenAndAddLists {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);
        Map<Boolean, List<Integer>> collect = integers.stream().
                collect(Collectors.groupingBy(num -> num % 2 == 0));
        System.out.println(collect.get(false));
        System.out.println(collect.get(true));

        Map<Integer, List<Integer>> collect1 = integers.stream()
                .collect(Collectors.groupingBy(num -> num / 10 * 10));
        System.out.println(collect1);

        List.of("as", "123", "32", "2as");
    }
}
