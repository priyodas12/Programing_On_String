package basic_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Test String::");
		String ip=scn.next();
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
	
		for(char c:ip.toCharArray()) {
			if(hm.containsKey(c)) {
				int counter=hm.get(c);//**
				hm.put(c,++counter);
			}
			else{
				hm.put(c,1);
			}
		}
		for(char c:hm.keySet()) {
			if(hm.get(c)>1) {
				System.out.println(c+" presents "+hm.get(c)+" times");
			}
		}
		
	}

}
