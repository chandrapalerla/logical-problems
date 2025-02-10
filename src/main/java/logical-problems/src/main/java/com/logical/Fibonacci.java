package com.logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter count of fibonnaci series");
		int count1 = s.nextInt();
		int count = count1-2;
		
		 int n1=0,n2=1,n3,i;
		 
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=1;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		 }    

	}

}
