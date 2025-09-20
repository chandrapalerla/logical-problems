package com.interview.streamapi;

import com.utility.TestData;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {

        Consumer<String> stringConsumer = (name) -> {
            if (name.length() > 5) {
                System.out.println(name);
            }
        };

        BiConsumer<Integer, String> integerStringBiConsumer =
            (key, value) -> System.out.println("key::" + key + "value:::" + value);

        List<String> names = TestData.getNamesList();

        names.stream().forEach(System.out::println);
        System.out.println("::::::::name length is more than 5:::::");
        names.stream().forEach(stringConsumer);

        Map<Integer, String> integerStringMap = TestData.getNamesMap();

        integerStringMap.entrySet().stream().forEach(System.out::println);
        integerStringMap.forEach(integerStringBiConsumer);

    }
}
