package com.interview.streamapi;

import com.hackerrank.A;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemSolvingQuestions {
    void main() {

        // Sort the array based on highest frequency
        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 5, 5, 5};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        System.out.print(entry.getKey() + " ");
                    }
                });

        // Return a new array that has unique values that doesn't has value 'c' using java 8.
        String[][] stAr = new String[][]{{"a", "b", "c"}, {"c", "a", "b", "d"}, {"a", "b", "e", "f"}};
        Set<String> collect = Arrays.stream(stAr)
                .flatMap(s -> Arrays.stream(s).filter(c -> !Objects.equals(c, "c")).distinct())
                .collect(Collectors.toSet());
        System.out.println(collect);

        // Separate digits and characters from a string
        String input = "a1b2c3d4e5f6g7h8i9j0";
        Map<Boolean, String> partitioned = IntStream.range(0, input.length())
                .mapToObj(input::charAt)
                .collect(Collectors.partitioningBy(Character::isDigit, Collectors.mapping(String::valueOf, Collectors.joining())));

        String digits = partitioned.get(true);
        String characters = partitioned.get(false);
        System.out.println("Digits: " + digits);
        System.out.println("Characters: " + characters);

        //1. **Separate odd and even numbers in a list of integers**
        //Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect1 = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect1);

       // 2. **Remove duplicate elements from a list using Java 8 streams**
        List<Integer> removeDuplicate = List.of(1, 2, 3, 4, 5, 6, 7, 4,5,6,7,8,9,8, 9, 10);
        List<Integer> list = removeDuplicate.stream().distinct().toList();
        System.out.println(list);

        //3. **Find the frequency of each element in an array or a list**
        List<Integer> frequencyElements = List.of(1, 2, 3,6,4,5,8,9, 4, 5, 6, 7, 4,5,6,7,8,9,8, 9, 10);

        Map<Integer, Long> frequencyElements1 = frequencyElements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyElements1);

       // **Find the frequency of each character in a string using Java 8 streams**
        String name = "chandrashekar";
        char[] charArray = name.toCharArray();
        Map<String, Long> collect2 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        //5. **Sort a given list of decimals in reverse order**
        List<Integer> reverseOrder = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> sorted = reverseOrder.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);

       // 6. **Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter**

        List<String> names = List.of("rock,ram,mike,onac,mikalai,pavel,hanna");
        String collect3 = names.stream().map(str -> "as prefix " + str + " as suffix").collect(Collectors.joining("."));
        System.out.println(collect3);

        //7. **Print the numbers from a given list of integers that are multiples of 5**
        List<Integer> multiplyOf5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = multiplyOf5.stream().map(num -> num * 5).toList();
        System.out.println(list1);

        //8. **Find the maximum and minimum of a list of integers**
        List<Integer> maxAndMin = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics collect4 = maxAndMin.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect4.getMax());
        System.out.println(collect4.getMin());

        // 9. **Merge two unsorted arrays into a single sorted array using Java 8 streams**

        int a[] = {2,3,5,6,5,6,7};
        int a1[] = {1,4,3,6,5,8,9,10};
        IntStream.concat(Arrays.stream(a), Arrays.stream(a1))
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        System.out.print(entry.getKey() + " ");
                    }
                });

        //10. **Merge two unsorted arrays into a single sorted array without duplicates**
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(a1)).distinct().toArray();
        System.out.println(Arrays.toString(array));

    }
}
//11. **Get the three maximum and three minimum numbers from a given list of integers**
//
//Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
//
//        12. **Check if two strings are anagrams or not using Java 8 streams**
//
//Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
//
//13. **Find the sum of all digits of a number in Java 8**
//
//Write a Java 8 program to find the sum of all digits of a given number.
//
//        14. **Find the second largest number in an integer array**
//
//Write a Java 8 program to find the second largest number in an integer array.
//
//15. **Sort a list of strings according to the increasing order of their length**
//
//Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
//
//        16. **Find the sum and average of all elements in an integer array**
//
//Write a Java 8 program to find the sum and average of all elements in an integer array.
//
//        17. **Find the common elements between two arrays**
//
//Write a Java 8 program to find the common elements between two arrays using streams.
//
//18. **Reverse each word of a string using Java 8 streams**
//
//Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.
//
//        19. **Find the sum of the first 10 natural numbers**
//
//Write a Java 8 program to find the sum of the first 10 natural numbers using streams.
//
//        20. **Reverse an integer array**
//
//Write a Java 8 program to reverse an integer array.
//
//        21. **Print the first 10 even numbers**
//
//Write a Java 8 program to print the first 10 even numbers.
//
//        22. **Find the most repeated element in an array**
//
//Write a Java 8 program to find the most repeated element in an array.
//
//        23. **Check if a string is a palindrome using Java 8 streams**
//
//Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.
//
//24. **Find strings in a list that start with a number**
//
//Given a list of strings, write a Java 8 program to find the strings that start with a number.
//
//        25. **Extract duplicate elements from an array**
//
//Write a Java 8 program to extract duplicate elements from an array.
//
//        26. **Print duplicate characters in a string**
//
//Write a Java 8 program to print the duplicate characters in a string.
//
//27. **Find the first repeated character in a string**
//
//Write a Java 8 program to find the first repeated character in a string.
//
//        28. **Find the first non-repeated character in a string**
//
//Write a Java 8 program to find the first non-repeated character in a string.
//
//29. **Generate the Fibonacci series**
//
//Write a Java 8 program to generate the Fibonacci series.
//
//        30. **Print the first 10 odd numbers**
//
//Write a Java 8 program to print the first 10 odd numbers.
//
//        31. **Get the last element of an array**
//
//Write a Java 8 program to get the last element of an array.
//
//32. **Calculate the age of a person in years**
//
//Write a Java 8 program to calculate the age of a person in years given their birthday.
