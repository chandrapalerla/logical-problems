package com.logical;

public class StringSlipt {

	public static void main(String[] args) {
		
		
		
		String s1 = "|chandr|ashekar";
		
		char [] tochar = s1.toCharArray();
		
		System.out.println(tochar);
		StringBuffer buffer = new StringBuffer();
		for (char c : tochar) {
			System.out.println(c);
			
			if(c == new Character('|')) {
				System.out.println("inside if");
				buffer.append("");
				continue;
			}
			buffer.append(c);	
		}
		String s2 = buffer.toString();
		System.out.println(s2);

	}

}
