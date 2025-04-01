package test.chayan.prac;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {

		String name = "chayan";
		HashMap<Character, Integer> newMap = new HashMap<Character, Integer>();
//		newMap.put('c', 1);
		for (char c : name.toCharArray()) {
			if (newMap.containsKey(c)) {
				newMap.put(c, newMap.get(c) + 1);
			} else {
				newMap.put(c, 1);
			}
		}
		
		for(Character key : newMap.keySet()) {
			System.out.println(key+ ":"+ newMap.get(key));
		}

	}

}
