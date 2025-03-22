package test.chayan;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {

		// Initialize the fruits list
		ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Grapes"));
		
		
		System.out.println("The Stream Api filter");
		fruitsList.stream().filter(fruit -> !fruit.startsWith("A"))
				.forEach(fruit -> System.out.print(fruit+","));
		
		 System.out.println();
		
		System.out.println("\nThe For Each loop");
		for (String fruit : fruitsList) {
			if (!fruit.startsWith("A")) {
				System.out.print(fruit+",");
			}
		}
	}
}
