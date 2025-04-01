package test.chayan.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int inputNo = sc.nextInt();

			if (numbers.contains(inputNo)) {
				sb.append("Number found ").append(inputNo);
				System.out.println(sb.toString());
			} else{
				sb.setLength(0);
				sb.append("Not found: ").append(inputNo);
				System.out.println(sb.toString());
				
			}
			
			sc.close();

		}
}
