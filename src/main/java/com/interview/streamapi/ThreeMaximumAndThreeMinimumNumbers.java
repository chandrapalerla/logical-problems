package com.interview.streamapi;

import java.util.Comparator;
import java.util.List;

public class ThreeMaximumAndThreeMinimumNumbers {
    static void main(){
        List<Integer> numbers = List.of(10,15,6,7,9,2,4,3,1,16,18);
        List<Integer> minNumbers = numbers.stream().sorted()
                .limit(3).toList();
        System.out.println(minNumbers);

        List<Integer> list = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(list);
    }
}
