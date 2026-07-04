package com.interview.streamapi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueSortedOrder {
    static void main(){
        Map<String, String> idValue = new HashMap<>();
        idValue.put("ID004", "David");
        idValue.put("ID005", "Emma");
        idValue.put("ID006", "Frank");
        idValue.put("ID007", "Grace");
        idValue.put("ID008", "Henry");
        idValue.put("ID009", "Ivy");
        idValue.put("ID010", "Jack");
        idValue.put("ID001", "Alice");
        idValue.put("ID002", "Bob");
        idValue.put("ID003", "Charlie");


        Map<String, String> collect = idValue.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue,newValue)->oldValue,
                        LinkedHashMap::new));
        System.out.println(collect);

        idValue.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

}
