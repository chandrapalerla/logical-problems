package com;

import java.util.*;

public class ProductPopularityCounter {

    private Map<String, PopularityCounter> products;
    private PopularityCounter root;

    ProductPopularityCounter() {
        products = new HashMap<>();
        root = new PopularityCounter();
        root.next = root;
        root.pre = root;
    }


    public String getMostPopular() {
        if(root.pre == root) return "";
        return root.pre.ids.getLast();
    }
    public void increment(String id) {
        if(!products.containsKey(id)) {
            if(root.next.popularity == 1) {
                root.next.ids.add(id);
                products.put(id, root.next);
            } else {
                products.put(id, root.add(id, 1));
            }

            return;
        }

        PopularityCounter existing = products.get(id);
        int newPopularity = existing.popularity + 1;

        if(existing.next.popularity == newPopularity) {
            existing.next.ids.add(id);
            products.put(id, existing.next);
        } else {
            products.put(id, existing.add(id, newPopularity));
        }
        existing.ids.remove(id);
        if(existing.ids.isEmpty())
            existing.remove();
    }
    public void decrement(String id) {
        if(!products.containsKey(id)) {
            return;
        }

        PopularityCounter existing = products.get(id);
        int newPopularity = existing.popularity - 1;

        if(existing.pre.popularity == newPopularity) {
            existing.pre.ids.add(id);
            products.put(id, existing.pre);
        } else {
            products.put(id, existing.pre.add(id, newPopularity));
        }
        existing.ids.remove(id);
        if(existing.ids.isEmpty())
            existing.remove();
    }

}


class PopularityCounter {
    int popularity;

    CustomLinkedHashSet<String> ids;

    PopularityCounter pre;
    PopularityCounter next;

    PopularityCounter() {
        popularity = -1;
        ids = new CustomLinkedHashSet<>();
        pre = null;
        next = null;
    }

    PopularityCounter(String id, int popularity) {
        this();
        this.popularity = popularity;
        this.ids.add(id);
    }

    public PopularityCounter add(String id, int popularity) {
        PopularityCounter newStat = new PopularityCounter(id, popularity);

        newStat.pre = this;
        newStat.next = this.next;
        this.next = newStat;
        newStat.next.pre = newStat;

        return newStat;
    }

    public void remove() {
        this.pre.next = this.next;
        this.next.pre = this.pre;

        this.pre = null;
        this.next = null;
    }
}


// Custom implementation because LinkedHashSet doesn't provide getLast() method
class CustomLinkedHashSet<K> {
    Node<K> head = null;
    Node<K> rear = null;
    Map<K, Node<K>> positions = new HashMap<>();

    public void add(K k) {
        Node<K> newNode = new Node<>(k);

        if(head == null) {
            head = newNode;
        } else {
            rear.next = newNode;
            newNode.pre = rear;
        }
        rear = newNode;
        positions.put(k, newNode);
    }

    public void remove(K k) {
        Node<K> existing = positions.get(k);

        if(existing == head) {
            head = existing.next;
            if(head != null)
                head.pre = null;
        } else if(existing == rear) {
            rear = existing.pre;
            if(rear != null)
                rear.next = null;
        } else {
            existing.pre.next = existing.next;
            existing.next.pre = existing.pre;
        }
        existing.pre = null;
        existing.next = null;

        positions.remove(k);
    }

    public K getLast() {
        if(rear == null) return null;

        return rear.value;
    }

    public boolean isEmpty() {
        return positions.isEmpty();
    }

    class Node<K> {
        K value;

        Node pre;
        Node next;

        Node(K v) {
            value = v;
        }
    }
}
