package com.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HackerrankExamples2 {

	public static void main(String[] args) {
		
		List<String> note = new ArrayList<String>();
		List<String> pens = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		int numberOfinputs = s.nextInt();
		
		System.out.println(numberOfinputs);
		
		for(int i=0;i<numberOfinputs;i++) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter the item");
			String input = s1.nextLine();
			if(input.contains("note")) {
				note.add(input);
			}
			if(input.contains("pen")) {
				pens.add(input);
			}
		}
		note.sort(Comparator.naturalOrder());
		pens.sort(Comparator.naturalOrder());
		
		System.out.println("note size:::" +note.size());
		System.out.println("pens size:::" +pens.size());
		
		System.out.println("............out put is................");
		System.out.println(numberOfinputs);
		System.out.println("Pens:");
		pens.forEach(pen ->{
			System.out.println(pen);
		});
		
		System.out.println("Notes:");
		note.forEach(notes ->{
			System.out.println(notes);
		});
	}
	
	

}
