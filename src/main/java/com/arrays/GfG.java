package com.arrays;

import java.util.*;

public class GfG {

    public static void main(String[] args) {
        Map<String, Integer> characterCounts = new LinkedHashMap<>();
        String inputString = "aaabbaanjkkllaajjaaabbnj";
        if (inputString == null || inputString.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            if (i + 1 < inputString.length() && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
            } else {
                String key = String.valueOf(inputString.charAt(i)).repeat(count);
                characterCounts.put(key, count);

                count = 1;
            }
        }
        System.out.println(characterCounts);
    }
    }
