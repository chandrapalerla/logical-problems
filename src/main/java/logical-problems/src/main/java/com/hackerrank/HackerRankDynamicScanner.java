package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HackerRankDynamicScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array :: ");
	      int size = sc.nextInt();
	      String myArray[] = new String[size];
	      System.out.println("Enter elements of the array :: ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.next();
	      }
	      
	      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
	      myList.sort(Comparator.naturalOrder());
	      System.out.println("myList::::" +myList);
	      myList.forEach(element ->{
	    	  	System.out.println("the string value is::" +element);
	      });
	      for (String string : myList) {
			
		}
	}
	
	
	
}
