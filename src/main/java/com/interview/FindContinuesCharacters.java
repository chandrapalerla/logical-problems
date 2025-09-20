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
//        System.out.println(stringIntegerMap);
//        Object collect = Arrays.stream(inputString.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        System.out.println(collect);

        String s = "aaabbaanjkkllaajjaaabbnj";
        //output:{aaa=2, bb=2, aa=2, kk=1, ll=1, jj=1, j=1, n=2}
        Map<String, Integer> subStringOcct = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                String currentSubStr = s.substring(i, i + j);
                if (isContiunous(currentSubStr)) {
                    subStringOcct.put(currentSubStr, subStringOcct.getOrDefault(currentSubStr, 0) + 1);

                }
            }
        }
        for (Map.Entry<String, Integer> entry : subStringOcct.entrySet()) {
            System.out.println("occurances of " + entry.getKey() + " :" + entry.getValue());
        }

    }

    public static boolean isContiunous(String subString) {
        char c = subString.charAt(0);
        for (int i = 1; i < subString.length(); i++) {
            if (subString.charAt(i) != c) {
                return false;
            }
            return true;
        }
        return false;
    }
}

