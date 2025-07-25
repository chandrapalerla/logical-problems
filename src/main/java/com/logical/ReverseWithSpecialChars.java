package com.logical;

public class ReverseWithSpecialChars {
    public static void main(String[] args) {
        String input = "Swa$pn&il";
        String output = reverseStringWithSpecialChars(input);
        System.out.println("Output : " + output);
    }

    public static String reverseStringWithSpecialChars(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer until it finds a letter or digit
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
                continue;
            }
            // Move right pointer until it finds a letter or digit
            if (!Character.isLetterOrDigit(chars[right])) {
                right--;
                continue;
            }

            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
