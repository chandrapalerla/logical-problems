package com.logical;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
        
        System.out.println("input string length is:::::"+inputString.length());
         
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
        
        for(int i=0; i<=inputString.length()-1; i++) {
        	
        	System.out.println(inputString.charAt(i));
        }
         
        sc.close();	

	}

}
