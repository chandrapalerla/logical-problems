package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackeRankCompareList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		Integer arr[] = new Integer[size];
		Integer arr1[] = new Integer[size];
		
		System.out.println("enter the arr[] elements:::");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("aList:::::" +aList);
		System.out.println("enter the arr1[] elements:::::");
		for(int j=0; j<size;j++) {
			arr1[j] = sc.nextInt();
		}
		
		ArrayList<Integer> bList = new ArrayList<Integer>(Arrays.asList(arr1));
		
		System.out.println("bList:::::::" +bList);
		
		 List<Integer> result = compareTriplets(aList, bList);
	}
	
	 static List<Integer> compareTriplets(List<Integer> aList, List<Integer> bList) {
		 ArrayList<Integer> list= new ArrayList<Integer>();
		 
		 Integer aPionts=0;
		 Integer bPionts=0;
		 for(int i=0;i<aList.size();i++) {
			 if(aList.get(i)>bList.get(i)) {
				 aPionts = aPionts+1;
			 }
			 if(aList.get(i)<bList.get(i)) {
				 bPionts = bPionts+1;
			 }
//			 if(aList.get(i)<bList.get(i)) {
//				 bPionts = bPionts+1;
//			 }
		 }
		 
		 list.add(aPionts);
		 list.add(bPionts);
		 
		 System.out.println(list);
		 return list;
	    }

}
