package com.interview;

import java.util.*;

public class LRUCacheWithExpiry<K, V> {

    private final int capacity;
    private final long ttlMillis;
    private final long ttiMillis;

    private final LinkedHashMap<K, CacheEntry<V>> map;

    public LRUCacheWithExpiry(int capacity, long ttlMillis, long ttiMillis) {
        this.capacity = capacity;
        this.ttlMillis = ttlMillis;
        this.ttiMillis = ttiMillis;

        this.map = new LinkedHashMap<K, CacheEntry<V>>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<K, CacheEntry<V>> eldest) {
                return size() > capacity;
            }
        };
    }

    public synchronized void put(K key, V value) {
        long now = System.currentTimeMillis();
        map.put(key, new CacheEntry<>(value, now, now));
    }

    public synchronized V get(K key) {
        CacheEntry<V> entry = map.get(key);

        if (entry == null) {
            return null;
        }

        long now = System.currentTimeMillis();

        // TTL Check
        if (ttlMillis > 0 && now - entry.createTime > ttlMillis) {
            map.remove(key);
            return null;
        }

        // TTI Check
        if (ttiMillis > 0 && now - entry.lastAccessTime > ttiMillis) {
            map.remove(key);
            return null;
        }

        entry.lastAccessTime = now;
        return entry.value;
    }

    static class CacheEntry<V> {
        V value;
        long createTime;
        long lastAccessTime;

        CacheEntry(V value, long createTime, long lastAccessTime) {
            this.value = value;
            this.createTime = createTime;
            this.lastAccessTime = lastAccessTime;
        }
    }
}