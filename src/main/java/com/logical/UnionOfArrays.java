package com.logical;

import java.util.Arrays;

public class UnionOfArrays {

	public static void main(String[] args) {
		int[] A = {4, 1, 2, 3, 3};
        int[] B = {2, 3, 1, 1};
        
        System.out.println(Arrays.toString(unionArrays(A, B)));

	}

	public static int[] unionArrays(int[]... arrays) {
		int maxSize = 0;
        int counter = 0;

        for(int[] array : arrays) maxSize += array.length;
        int[] accumulator = new int[maxSize];
        
        System.out.println(accumulator.length);

        for(int[] array : arrays)
            for(int i : array)
                if(!isDuplicated(accumulator, counter, i))
                    accumulator[counter++] = i;

        int[] result = new int[counter];
        for(int i = 0; i < counter; i++) result[i] = accumulator[i];
		return result;
	}

	private static boolean isDuplicated(int[] array, int counter, int value) {
		for(int i = 0; i < counter; i++) if(array[i] == value) return true;
        return false;
	}

}
