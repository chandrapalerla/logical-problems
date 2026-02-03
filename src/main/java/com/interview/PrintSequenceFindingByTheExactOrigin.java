package com.interview;

import java.util.*;

public class PrintSequenceFindingByTheExactOrigin {
    static void main() {
        List<String> tripTickets =
                Arrays.asList("KOL-BOM", "BOM-DEL", "HYD-KOL");

        Map<String, String> tripMap = new HashMap<>();
        Set<String> destinations = new HashSet<>();

        // Build map and destination set
        for (String ticket : tripTickets) {
            String[] cities = ticket.split("-");
            tripMap.put(cities[0], cities[1]);
            destinations.add(cities[1]);
        }

        // Find starting city (origin)
        String start = null;
        for (String source : tripMap.keySet()) {
            if (!destinations.contains(source)) {
                start = source;
                break;
            }
        }

        // Print trip in sequence
        List<String> result = new ArrayList<>();
        while (start != null && tripMap.containsKey(start)) {
            String next = tripMap.get(start);
            result.add(start + "-" + next);
            start = next;
        }

        System.out.println(String.join(", ", result));
    }
}
