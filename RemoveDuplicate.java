package basic_questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Test String::");
		String ip=scn.next();
		Arrays.asList(ip.split("")).stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
	}
}
