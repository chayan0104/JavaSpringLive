package test.chayan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

		 for (int number : numbers) {
			 sb.append(number).append(",");
		 }
		 if(sb.length()>0) {
			 sb.setLength(sb.length()-1);
		 }
		 
		 System.out.println("Numbers are:" + sb.toString());
			

		}
}
