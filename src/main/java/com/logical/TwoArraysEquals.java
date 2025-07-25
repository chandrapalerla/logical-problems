package com.logical;

public class TwoArraysEquals {

	public static void main(String[] args) {
		
		int [] a1 = {1,2,3,4,5};
		
		int [] a2 = {1,2,3,4,5};
		
		boolean status= true;
		
		if(a1.length == a2.length) {
			for(int i=0; i<a1.length;i++) {
					if(a1[i]!=a2[i]) {
						status = false;
					}
				}

		} else {
			status = false;
		}
		
		if(status) {
			System.out.println(" two arrays are equal");
		} else {
			System.out.println("two arrays are not equal");
		}

	}

}
