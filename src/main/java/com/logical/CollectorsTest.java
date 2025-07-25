package com.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {

        String[] strings = {"flower", "flow", "flight"};

        String prefix = strings[0];

        System.out.println(longestCommonPrefix(strings, prefix));
    }

    private static String longestCommonPrefix(String[] strings, String prefix) {
        for(int i = 1; i < strings.length; i++ ){

            while(!strings[i].startsWith(prefix)){

                prefix = prefix.substring(0 , prefix.length()-1);

                if(prefix.isEmpty()){

                    return "";
                }

            }

        }

        return prefix;
    }
}
