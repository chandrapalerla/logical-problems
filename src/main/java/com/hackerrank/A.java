package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class A{
    static void main() {
        List<String> list = Arrays.asList("pavel", "mikalai", "donald", "onac",
                "ragav", "maset", "ahncy");
        String collect = list.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(f -> f.charAt(0)))
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
	}
