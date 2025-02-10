package com.logical;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("chandu", "java");
		map.put("chandu", "java");
		map.put("shekar", "c++");
		map.put("raju", "java and C++");
		
		System.out.println(map);
		
		map.forEach((k , v) -> System.out.println(map.get(k)));
		
		Set<String> set = map.keySet();
		
		for(String s :set) {
			
			System.out.println(s +":::"+map.get(s));
		}
		
		String result = map.entrySet().stream()
				.filter(x -> "java".equals(x.getValue()))
				.map(x->x.getValue())
				.collect(Collectors.joining());
		
		
			System.out.println(result);
	
	}

}
