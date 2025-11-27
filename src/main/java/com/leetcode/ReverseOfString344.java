package com.leetcode;

public class ReverseOfString344 {
    void main() {
        String s = "hello";
        String reversed = reverseString(s);
        System.out.println(reversed); // Output: "olleh"
    }
    private String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

}
