package com.logical;

import java.util.Arrays;

public class BalanceParanthesis {

	public static void main(String[] args) {
		String input = "{()[]}";
		char[] inputArray = input.toCharArray();
		System.out.println(inputArray[0]);

		int length = inputArray.length;

		boolean input1 = check(inputArray, length);
		
		if(input1)
			 System.out.println("Balanced"); 
        else
            System.out.println("Not Balanced"); 
		

	}

	private static boolean check(char[] inputArray, int length) {
		if (length == 0)
			return true;
		if (length == 1)
			return false;
		if (inputArray[0] == ')' || inputArray[0] == '}' || inputArray[0] == ']')
			return false;
		
		System.out.println(length);
		
		char closing = findClosing(inputArray[0]);
		System.out.println("inputArray[0]:::" );
		System.out.println("inputArray[0]:::" +inputArray[0]+"     "+"closing:::::::" +closing);
		
		int i, count = 0;
		for (i = 1; i < length; i++) {
			if (inputArray[i] == inputArray[0]) {
				count++;
			}
			if (inputArray[i] == closing) {
				if (count == 0)
					break;
				count--;
			}
		}
		
		
		if (i == length) 
            return false; 

        if (i == 1) 
            return check(Arrays.copyOfRange(inputArray, i + 1, length), length - 2);
       
        return check(Arrays.copyOfRange(inputArray, 1, length), i - 1) && check(Arrays.copyOfRange(inputArray, (i + 1), length), length - i - 1);

	}

	private static char findClosing(char c) {
		if (c == '(')
			return ')';
		if (c == '{')
			return '}';
		if (c == '[')
			return ']';

		return Character.MIN_VALUE;
	}

}
