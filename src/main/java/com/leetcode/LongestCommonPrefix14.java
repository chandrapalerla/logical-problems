package com.leetcode;

public class LongestCommonPrefix14 {
    void main() {
        String[] strs = {"flower", "flow", "flight"};
        String lcp = longestCommonPrefix(strs);
        System.out.println(lcp); // Output: "fl"
    }
    private String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}