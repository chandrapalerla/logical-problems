package com.hackerrank;

import java.util.Scanner;

public class HackerrankReverceString3 {

	public static void main(String[] args) {

		Scanner inputString = new Scanner(System.in);

		String s, lowerCase, reverece = "";
		s = inputString.nextLine();

		lowerCase = s.toLowerCase();

		for (int i = lowerCase.length()-1; i >=0; i--) {
			reverece = reverece + lowerCase.charAt(i);
		}
		
		System.out.println(reverece);
	}

}
