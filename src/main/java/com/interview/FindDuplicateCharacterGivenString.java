package com.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharacterGivenString {
    static void main() {
        String s = "chandrashekar";
        Map<Character, Integer> duplicateChar = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(duplicateChar.containsKey(ch)){
                duplicateChar.put(ch,duplicateChar.get(ch)+1);
            } else{
                duplicateChar.put(ch,1);
            }
        }

        for(Character c :duplicateChar.keySet()){
            if(duplicateChar.get(c)>1){
                System.out.println(c);
            }
        }

        //using streams
        String duplicate = Stream.of(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue()>1)
                .map(Map.Entry::getKey)
                        .collect(Collectors.joining(","));

        System.out.println(duplicate);

    }
}
