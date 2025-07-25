package com.logical;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(1, "Welcome");
		m.put(2, "to");
		m.put(3, "Edureka's");
		m.put(4, "Demo");

		System.out.println(m);

		// Here we cant add Hello because 101 key
		// is already present in ConcurrentHashMap object
		m.putIfAbsent(3, "Online");
		System.out.println("Checking if key 3 is already present in the ConcurrentHashMap object: " + m);

		// We can remove entry because 101 key
		// is associated with For value
		m.remove(1, "Welcome");
		System.out.println("Removing the value of key 1: " + m);

		// Now we can add Hello
		m.putIfAbsent(1, "Hello");
		System.out.println("Adding new value to the key 1: " + m);

		// We cant replace Hello with For
		m.replace(1, "Hello", "Welcome");
		System.out.println("Replacing value of key 1 with Welcome: " + m);
	}
}