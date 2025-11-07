package com.pattern;

import java.util.Scanner;

/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
public class Pattern6 {

	static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter number of rows");
		int n = scanner.nextInt();
		
		for(int i=n; i>=1;i--) {
			
			for(int j=i; j>=1;j--) {
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}

	}

}
