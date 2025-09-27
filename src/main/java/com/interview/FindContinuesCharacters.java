package com.interview;

import java.util.HashMap;
import java.util.Map;

public class FindContinuesCharacters {
    public static void main(String[] args) {
        String inputString = "aaabbaanjkkllaajjaaabbnj";
        char[] chars = inputString.toCharArray();
        Character temp = chars[0];
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        StringBuilder buffer = new StringBuilder();
        for (char aChar : chars) {
            if (temp.equals(aChar)) {
                buffer.append(aChar);
            } else {
                if (stringIntegerMap.get(buffer.toString()) != null) {
                    stringIntegerMap.put(buffer.toString(), stringIntegerMap.get(buffer.toString()) + 1);
                } else {
                    stringIntegerMap.put(buffer.toString(), 1);
                }
                temp = aChar;
                buffer = new StringBuilder();
                buffer.append(aChar);
            }
        }
        System.out.println(stringIntegerMap);
    }
}

