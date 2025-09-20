package com.interview.streamapi;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        str.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry-> System.out.println("First non-repeated character: " + entry.getKey()));
    }
}
