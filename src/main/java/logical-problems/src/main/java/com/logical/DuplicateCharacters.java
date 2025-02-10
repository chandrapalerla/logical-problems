package com.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		System.out.println("please enter input string");
		Scanner s = new Scanner(System.in);
		
		String inputString = s.nextLine();
		System.out.println("the input string is:::::" +inputString);
		
		char[] stringArray = inputString.toCharArray();
		
		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		for(char c: stringArray) {
			if(characterMap.containsKey(c)) {
				characterMap.put(c, characterMap.get(c)+1);
			} else {
				characterMap.put(c, 1);
			}
			
		}
		System.out.println("string map is::::: "+characterMap);
		
		Set<Character> keySet = characterMap.keySet();
		
		System.out.println("key set is::::" +keySet);
		
		for (char c : keySet) {
			if(characterMap.get(c)>1) {
				System.out.println(c  +":::"+characterMap.get(c));
			}
		}
	}

}
