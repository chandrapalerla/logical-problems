package com.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4};
		int [] b = {4,3,5,6};
		
		int aLength = a.length;
		int bLength = b.length;
		int ans = 0; 
		Set<Integer> set = new HashSet<Integer>();
		//using Iterative method
		for(int i=0 ; i<aLength; i++) {
			for(int j=0; j<bLength; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);
		//using retainAll Method
		List<Integer> alist = Arrays.asList(new Integer[] {1,1,2});
	    List<Integer> blist = Arrays.asList(new Integer[] {1,1,3});

	    HashSet<Integer> aset =  new HashSet<>(alist);
	    aset.retainAll(blist);

	    System.out.println(aset);

	}

}
