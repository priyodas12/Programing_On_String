package basic_questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintFirstRepetedCharacter {
	static void print1stRepeted(String s) {
		Set<Character> store=new HashSet<Character>();
		for(char c:s.toCharArray()) {
			if(!store.add(c)) {
				System.out.println("First Repeted Character>> "+c);
				return;
			}
		}	
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Test String::");
		String ip=scn.next();
		print1stRepeted(ip);
	}
}
