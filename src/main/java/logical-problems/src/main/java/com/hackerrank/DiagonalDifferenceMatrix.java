package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiagonalDifferenceMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(element -> {
			try {
				arr.add(IntStream.range(0, n).map(ele -> sc.nextInt()).boxed().collect(Collectors.toList()));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
		System.out.println(arr);
	}
}
