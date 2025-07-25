package com.pattern;

/*
 		*
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */

public class Pattern7 {

	public static void main(String[] args) {
		
		String s1="chandu";
		String s2 = new String("chandu");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		int rows = 5, k = 0;
        for(int i = 1; i <= rows; i++, k = 0) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }

		
	}

}
