package com.interview.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        isUniqueChars();
    }

    /**
     * Checks if all characters in the given string are unique.
     * <p>
     * This method uses Java Streams to convert the string into a stream of characters,
     * collects them into a Set (which removes duplicates), and compares the size of the Set
     * to the length of the original string. If they are equal, all characters are unique.
     * </p>
     * <p>
     * Example: For the string "stream", the output will be true since all characters are unique.
     * </p>
     */
    private static void isUniqueChars() {
        String s = "stream";
        boolean allUnique = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet())
                .size() == s.length();
        System.out.println("All characters are unique: " + allUnique);
    }
}
