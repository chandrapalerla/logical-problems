package com.interview.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindAllUniqueWordsStarts {
    static void main(){
        String[] input = new String[]{
                "This JEP is #mainly for scientific #applications",
                "and it makes #floating-point operations consistently #strict.",
                "The default #floating-point operations are #strict or strictfp,",
                "both of which guarantee the same results from the #floating-point calculations on every platform."
        };
        // put your solution

        String collect = Arrays.stream(input)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.startsWith("#"))
                .map(word->word.replaceAll("[^#a-zA-Z-]", ""))
                .distinct()
                .collect(Collectors.joining(","));

        System.out.printf(collect);

    }
}
