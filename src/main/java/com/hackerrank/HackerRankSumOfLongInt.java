package com.hackerrank;

import java.util.Date;
import java.util.Scanner;

public class HackerRankSumOfLongInt{

	public static void main(String argv[]) {
		Date d = new Date();
		System.out.println(d.getTime());

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		long[] arr = new long[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextLong();
		}
		
		System.out.println(arr);
		long result = aVeryBigSum(arr);
	}
	
	static long aVeryBigSum(long[] ar) {
		long result=0;
		for(long l : ar) {
			result = result+l;
		}
		System.out.println(result);
		return result;
    }
	
}
