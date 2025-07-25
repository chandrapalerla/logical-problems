package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		
		Scanner dd = new Scanner(System.in);
		String [] vars = new String[2];

		for(int i = 0; i < vars.length; i++) {
		  System.out.println("Enter the string : ");
		  vars[i] = dd.nextLine();
		}	
		String string1 = vars[0];
		String string2 = vars[1];
		String s1 = string1.replaceAll("\\s", "");
		String s2 = string2.replaceAll("\\s", "");
		char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
		 boolean status = false;
		if(s1.length() != s2.length()) {
			status = false;
		} else {
			/*Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);*/
			for(int i=0; i<s1Array.length; i++) {
				char iString = s1Array[i];
				for(int j=0; j<s2Array.length; j++) {
					char jString = s2Array[j];
					if(iString == jString) {
						status = true;
					}
				}
			}
		}
		if(status) {
			System.out.println(" Strings are qual");
		} else {
			System.out.println(" Strings are not qual");
		}
	}
	
}
