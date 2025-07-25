package com.logical;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int stringLength = s.length();
		String reverce = "";
		System.out.println("string length::::" +stringLength);
		
		char [] c = s.toCharArray();
		System.out.println("string length::::" +c[0]);
		for(int i=stringLength-1; i>=0; i--) {
			reverce = reverce + s.charAt(i);
		}
		System.out.println(" reverce of string is:::::" +reverce);
		if(s==reverce) {
			System.out.println("palindrum");
		} else {
			System.out.println("not palindrum");
		}
	}

}
