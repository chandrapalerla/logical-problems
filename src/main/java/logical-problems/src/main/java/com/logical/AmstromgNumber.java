package com.logical;

import java.util.Scanner;

public class AmstromgNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int r;
		int result = 0;
		int pow =0;
	
		while(n>0) {
			r = n%10;
			result = (int) (result+Math.pow(r, 3));
			n=n/10;
		}
		
		System.out.println("the result is:::::" +result);
		
		if(n==result) {
			
			System.out.println("Given number is Amstrog number");
			
		} else {
			System.out.println("GIven number is not Amstrong number");
		}

	}

}
