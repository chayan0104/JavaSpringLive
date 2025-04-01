package test.chayan.ques;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("write something !");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(reverseDemo(input));;

	}
	
	public static String reverseDemo(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		
	}

}
