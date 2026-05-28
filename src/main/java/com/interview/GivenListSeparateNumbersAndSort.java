package com.interview;

import java.util.Arrays;
import java.util.List;

public class GivenListSeparateNumbersAndSort {
    static void main() {
        List<String> strArr = Arrays.asList("1,2,3", "3,4,5", "6,abc,7", "8,9,10", "10,2,4");
        List<String> list = strArr.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(s->s.chars().allMatch(Character::isDigit))
                .distinct()
                .toList();
        System.out.println(list);
    }
}
