package com.pattern;

import java.util.Scanner;

/* print the below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class Pattern2 {

	static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		for(int i =n-1; i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
