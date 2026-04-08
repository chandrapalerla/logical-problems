package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring3 {
    static void main() {

        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {

        int ans = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch,right));
            }
            else{
                left = Math.max(left,map.get(ch)+1);
                map.put(ch, right);
            }
            ans = Math.max(ans, right - left + 1);

        }
        return ans;
    }
}
