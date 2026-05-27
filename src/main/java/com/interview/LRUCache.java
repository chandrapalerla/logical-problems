package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }


    static void main() {
        LRUCache cache = new LRUCache(3);
        cache.put(2, 3);
        cache.put(3, 5);
        cache.put(4, 6);
        cache.put(5, 7);
        cache.put(6, 7);

        System.out.println(cache.get(2));
    }

    public int get(Integer value) {
        return map.getOrDefault(map.get(value), 0);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}

