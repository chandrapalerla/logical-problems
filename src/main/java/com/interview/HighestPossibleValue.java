package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestPossibleValue {
    public static void main(String[] args) {
        //int[] arr = {1, 34, 3, 98, 9, 76, 45, 4};
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(34);
        intList.add(3);
        intList.add(98);

//        Arrays.stream(arr).mapToObj(i -> i + "")
//                .sorted((o1, o2) -> (o2 + o1)
//                        .compareTo(o1 + o2)).forEach(System.out::print);

        //TODO Even and add digits
        //out put :[34, 98][1, 3]
        Map<Boolean, List<Integer>> partitions = intList.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);
        System.out.println(evens);
        System.out.println(odds);

        String s = "the quick brown fox jumps right over the little lazy dog.";
        //TODO Find 2 owls  words
        //out put: quick,over,little
        Arrays.stream(s.split(" "))
                .filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);

        //TODO First Non Repeated character : Out put: q
        String res = Arrays.stream(s.split(""))
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c)).findFirst().get();
        System.out.println(res);
    }
}
