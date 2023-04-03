package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 8 };
		Arrays.sort(data);
		int num = data.length;
		System.out.println("Second Largest Number: " + data[num - 2]);
	}

}
