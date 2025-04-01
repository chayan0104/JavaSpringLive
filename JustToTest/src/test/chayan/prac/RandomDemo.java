package test.chayan.prac;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Random ranNo = new Random(10);

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numbers.add(ranNo.nextInt(100));
		}

		for (int i = 1; i < numbers.size(); i++) {
			sb.append(numbers.get(i));
			if (i < numbers.size() - 1) {
				sb.append(",");
			}
		}

		System.out.println("Numbers are :" + sb.toString());

	}

}
