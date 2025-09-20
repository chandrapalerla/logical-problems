package com.interview.streamapi;

import com.utility.TestData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        List<String> namesList = TestData.getNamesList();
        //sort length

        Map<Character, String> collect = namesList.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(s1 -> s1.charAt(0)))
                .collect(Collectors.groupingBy(s->s.charAt(0),Collectors.joining(",")));
        System.out.println(collect);

    }
}
