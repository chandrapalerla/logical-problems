package com.logical;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
//		Scanner sysin = new Scanner(System.in);
//		String inputString = sysin.next();
		String s2=""; 
		String s1 = "EP05PalerlaChandrasheakr9542052557";
		String regex = "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}";
		
//		System.out.println(inputString);
		try {
		boolean b1 = Pattern.matches(regex, s1);
		System.out.println(b1);
		 Pattern.matches(regex, s1);
		}catch (Exception e) {
			System.out.println("i Ban is invalid");
			e.printStackTrace();
			e.getMessage();
		}
	
		
		/* 
		 * if(b1) s2 = "1"; else s2="0";
		 * 
		 * System.out.println(s2);
		 */
		

	}

}
