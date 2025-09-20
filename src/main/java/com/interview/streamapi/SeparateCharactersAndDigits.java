package com.interview.streamapi;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeparateCharactersAndDigits {
    public static void main(String[] args) {
        String input = "a1b2c3d4e5f6g7h8i9j0";
        Map<Boolean, String> partitioned = IntStream.range(0, input.length()).mapToObj(input::charAt).collect(Collectors.partitioningBy(Character::isDigit, Collectors.mapping(String::valueOf, Collectors.joining())));

        String digits = partitioned.get(true);
        String characters = partitioned.get(false);
        System.out.println("Digits: " + digits);
        System.out.println("Characters: " + characters);
    }
}
