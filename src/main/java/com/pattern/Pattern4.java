package com.pattern;

import java.util.Scanner;

/*
7 6 5 4 3 2 1
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4
7 6 5
7 6
7
 */

public class Pattern4 {

	static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter number of rows");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
		
			System.out.println();
		}
		

	}

}
