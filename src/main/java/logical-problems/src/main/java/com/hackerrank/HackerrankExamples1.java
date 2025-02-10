package com.hackerrank;

import java.util.Scanner;

public class HackerrankExamples1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N==2 && N<=5){
            System.out.println("Not Weird");
        } else if((N == 6) || (N <= 20)){
            System.out.println("Weird");
        } else if(N <= 100){
            System.out.println("Not Weird");
        } else 
        scanner.close();
	}

}
