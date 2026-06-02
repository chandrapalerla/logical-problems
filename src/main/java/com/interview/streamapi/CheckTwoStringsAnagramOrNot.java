package com.interview.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckTwoStringsAnagramOrNot {
    static void main() {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagramUsingStream(s1, s2));
    }

    private static boolean isAnagramUsingStream(String s1, String s2) {
        String string1 = Arrays.stream(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        String string2 = Arrays.stream(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        return string1.equals(string2);
    }


    private static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> string1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (string1.containsKey(c)) {
                string1.put(c, string1.get(c) + 1);
            } else {
                string1.put(c, 1);
            }
        }
        for (char c : s2.toCharArray()) {
            if (string1.containsKey(c)) {
                string1.put(c, string1.get(c) - 1);
                if (string1.get(c) < 1) {
                    string1.remove(c);
                }
            } else {
                return false;
            }
        }
        return string1.isEmpty();
    }
}
