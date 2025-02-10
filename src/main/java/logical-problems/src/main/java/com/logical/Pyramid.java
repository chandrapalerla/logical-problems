package com.logical;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int noOfRows = s.nextInt();
		
		System.out.println("number of rows:::::" +noOfRows);
		
		int rowCount = 1;
		 
        System.out.println("Here Is Your Pyramid");
      
        for(int i=1;i<=noOfRows;i++) {
        	
            for(int j=1;j<noOfRows-i;j++) {
                System.out.print(" ");
            }
           for(int k=1;k<=i;k++) {
               System.out.print(" "+i);
           }
           System.out.println();  
       }
 

        int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print(i+" ");
                ++k;
            } 

            System.out.println();
        }
	}

}
