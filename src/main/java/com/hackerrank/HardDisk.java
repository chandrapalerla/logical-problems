package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardDisk {

	public static void main(String[] args) {
		int x = 3;
		int value = 0x00F;
		int mask = 0x2222;
		System.out.println(value & mask);
		List<Integer> space = Arrays.asList(2, 5, 4, 6, 8);
		HardDisk disk = new HardDisk();
		disk.segment(x, space);

	}

	public  int segment(int x, List<Integer> space) {
		int maximum = 0;
		ArrayList list = new ArrayList();
		for (int i = 1; i <=x; ++i) {
			int[] ia = new int[3];
			for(int j=1;j<=3;j++) {
				int index=i;
				ia[0]=space.indexOf(i);
				i++;
			}
			list.add(ia);
		}
		System.out.println(list);
		return maximum;

	}

}
