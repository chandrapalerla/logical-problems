package com.logical;

import java.util.Arrays;

public class UnionOfArrays2 {

	public static void main(String[] args) {
		
		int[] a = {4, 1, 2, 3, 3};
        int[] b = {2, 3, 1, 1};
        int cLength = a.length+b.length;
        int c[] = new int[cLength];
        int counter = 0;
        System.out.println(c.length);
        
        for(int i=0;i<a.length;i++) {
           	for(int j=0;j<b.length; j++) {
           		
           		if(a[i]==b[j]) {
           			c[counter++] = i;
           		}
        		
        	}
        }
        
        System.out.println(Arrays.toString(a));

	}

}
