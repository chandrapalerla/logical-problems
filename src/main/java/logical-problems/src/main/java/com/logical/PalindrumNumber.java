package com.logical;

import java.util.Scanner;

public class PalindrumNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int r;
		int temp = n;
		while(n>0)
		{
			r= n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("given number is palindrum");
		} else {
			System.out.println("given number is not palindrum");
		}
	}

}
