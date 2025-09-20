package com.interview.streamapi;

import java.util.stream.IntStream;

public class PalindromicSubstrings {

    public static void main(String[] args) {
        String input = "ababa";
        palindromeSubStrings(input);
    }

    /*
     * Finds and prints all palindromic substrings in the given input string.
     * <p>
     * This method generates all possible substrings of the input string using nested streams.
     * It then filters these substrings to find those that are palindromes (strings that read the same forwards and backwards)
     * and have a length greater than 1. Finally, it prints each palindromic substring to the console.
     * </p>
     * <p>
     * Example: For the input string "ababa", the output will be:
     * aba
     * ababa
     * bab
     * </p>
     *
     * @param input The input string to search for palindromic substrings.
     */
    private static void palindromeSubStrings(String input) {
        IntStream.range(0, input.length())
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, input.length() + 1)
                        .mapToObj(j -> input.substring(i, j)))
                .filter(s -> s.length() > 1 && isPalindrome(s))
                .forEach(System.out::println);
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
