package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences187 {
    void main() {
        String s = "AAAAAAAAAAAAA";
        List<String> repeated = findRepeatedDnaSequences(s);
        System.out.println(repeated);
    }

    private List<String> findRepeatedDnaSequences(String s) {
        Set<String> see = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int n = s.length();
        int l = 10;
        if (s == null && n < 10) {
            return new ArrayList<>();
        }
        for (int i = 0; i <= n - l; i++) {
            String subString = s.substring(i, i + l);
            if (see.contains(subString)) {
                repeated.add(subString);
            } else {
                see.add(subString);
            }
        }
        return new ArrayList<>(repeated);
    }
}
