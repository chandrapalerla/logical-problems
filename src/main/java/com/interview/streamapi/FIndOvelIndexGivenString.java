package com.interview.streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class FIndOvelIndexGivenString {
    static void main() {
        String s = "I love java";
        List<Character> ovels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        IntStream.range(0, s.length()).filter(index -> ovels.contains(s.charAt(index))).forEach(index -> {
            System.out.println("ovel Character:::" + s.charAt(index)+"  "+"ovel index::::::" + index);
        });
    }
}
