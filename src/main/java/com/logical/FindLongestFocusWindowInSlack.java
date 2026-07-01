package com.logical;

import java.util.HashMap;
import java.util.Map;

record FocusWindow(int length, int start, int end, String substring) {
}

public class FindLongestFocusWindowInSlack {
    static void main() {
        String s = "CCEMMCCCEM";
        int k = 2;

        FocusWindow focusWindow = longestFocusWindow(s, k);
        System.out.println(focusWindow);
    }

    private static FocusWindow longestFocusWindow(String s, int k) {
        if (s == null || s.isEmpty() || k == 0) return new FocusWindow(0, -1, -1, "");
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0, best = 0, bestStart = 0;

        for (int right = 0; right < s.length(); right++) {
            counts.merge(s.charAt(right), 1, Integer::sum);
            while (counts.size() > k) {
                char c = s.charAt(left++);
                if (counts.merge(c, -1, Integer::sum) == 0) counts.remove(c);
            }
            if (right - left + 1 > best) {
                best = right - left + 1;
                bestStart = left;
            }
        }
        int bestEnd = bestStart + best - 1;
        return new FocusWindow(best, bestStart, bestEnd, s.substring(bestStart, bestEnd + 1));
    }
}
