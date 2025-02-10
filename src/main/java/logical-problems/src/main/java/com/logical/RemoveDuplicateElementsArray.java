package com.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsArray {

	public static void main(String[] args) {
		
		Integer[] a = {1,1,2,2,3,4,5};
		
		
		//method 1
		Set<Integer> set = new HashSet<Integer>();
		for(int a2 : a) {
			set.add(a2);
		}
		System.out.println(set);
		
		 Integer[] tempArray = removeDuplicates(a);
		 
	        // Verify the array content
	        System.out.println(Arrays.toString(tempArray));
					
	        int length = a.length;  
	      //  length = removeDuplicateElements(a, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(a[i]+" ");  
	}
	 private static Integer[] removeDuplicates(Integer[] origArray) {
		 
	        Integer[] tempArray = new Integer[origArray.length];
	         
	        int indexJ = 0;
	        for (int indexI = 0; indexI < origArray.length - 1; indexI++)
	        {
	            Integer currentElement = origArray[indexI];
	             System.out.println(currentElement);
	             System.out.println(origArray[indexI+1]);
	             System.out.println("*******************");
	            if (currentElement != origArray[indexI+1]) {
	                tempArray[indexJ++] = currentElement;
	            }
	        }
	         
	        tempArray[indexJ++] = origArray[origArray.length-1];
	         
	        return tempArray;
	    }
	 
	 
	 public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
}	

