package com.logical;

public class MultipleLinesToSingleLine {

	public static void main(String[] args) {
		
		String sample="We are going to replace newline character \n New line should start now if \n is working"; 
		System.out.println("Original String: " + sample);
		String replaceAll = sample.replaceAll("\n", "");
		System.out.println(replaceAll);
	}

}
