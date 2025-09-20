package com.interview.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s = "dabfcadef";
        String uniqueString = Arrays.stream(s.split(""))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(uniqueString);
    }
}
