package com.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfCitiesGroupBy {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Mumbai","Munnar","chennai","Hyderabad");
        Map<Character, String> collect = cities.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.joining(",")));

        System.out.println(collect);
    }
}
