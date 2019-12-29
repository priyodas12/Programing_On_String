package basic_questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateStringPrintInFile {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> map = new HashMap<String,Integer>();
		Scanner read = new Scanner(new File("C:\\Users\\Priyo\\Desktop\\output.txt"));
	    while (read.hasNext()) {
	        String line = read.next();
	        if(map.containsKey(line)) {
	            map.put(line, map.get(line)+1);
	        } else {
	            map.put(line, 1);
	        }
	    }
	    System.out.println("Duplicate Below::");
	    for(String s:map.keySet()) {
	    	if(map.get(s)>1) {
	    		System.out.println(s);
	    	}
	    }

	}

}
