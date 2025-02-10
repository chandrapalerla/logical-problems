package com.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "heart";

		String s2 = "earth";

		char[] c = s1.toCharArray();
		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		for (char c1 : c) {
			if (characterMap.containsKey(c1)) {
				characterMap.put(c1, characterMap.get(c) + 1);
			} else {
				characterMap.put(c1, 1);
			}

		}
		char[] c2 = s2.toCharArray();
		Map<Character, Integer> characterMap1 = new HashMap<Character, Integer>();
		for (char c1 : c2) {
			if (characterMap1.containsKey(c1)) {
				characterMap1.put(c1, characterMap1.get(c1) + 1);
			} else {
				characterMap1.put(c1, 1);
			}

		}
		
		Set<Character> map1keyset = characterMap.keySet();
		boolean anagramStatus = true;
		for(char anagram : map1keyset) {
			if(characterMap1.containsKey(anagram)) {
				anagramStatus = true;
			} else {
				anagramStatus = false;
			}
		}
		
		if(anagramStatus==true) {
			System.out.println("the given strings are Anagram");
		} else {
			System.out.println("the given strings are not Anagram");
		}

	}

}
