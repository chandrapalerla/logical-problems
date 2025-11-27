package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram242 {
    void main() {
        String s = "ab";
        String t = "ba";
        System.out.println(isValidAnagram(s, t));
    }

    // Using Hash Map
    private boolean isValidAnagram1(String s, String t) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            firstMap.put(ch[i], firstMap.getOrDefault(ch[i], 0) + 1);
        }
        char[] ch2 = t.toCharArray();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int j = 0; j < t.length(); j++) {
            secondMap.put(ch2[j], secondMap.getOrDefault(ch2[j], 0) + 1);
        }
        for (Character c : firstMap.keySet()) {
            if (!Objects.equals(firstMap.get(c), secondMap.get(c))) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }


}
