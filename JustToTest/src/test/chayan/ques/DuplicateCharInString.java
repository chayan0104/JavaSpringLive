package test.chayan.ques;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		System.out.println("Type something :");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine().toLowerCase();

		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

		for (char c : inputString.toCharArray()) {
			if (myMap.containsKey(c)) {
				myMap.put(c, myMap.get(c) + 1);
			} else {
				myMap.put(c, 1);
			}
		}
		
		for(Character key : myMap.keySet()) {
			if(myMap.get(key)>1) {
				System.out.println(key +": "+myMap.get(key));
				
			}
		}
	}

}
