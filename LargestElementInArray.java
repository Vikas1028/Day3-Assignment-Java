package Array;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String[] args) {
		// input array
		Double[] number = new Double[10];
		double b = 0;
		int c = 0;
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.nextDouble();
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] > b) {
				b = number[i];
				c = i;
			} else {
			}
		}
		System.out.println("number[" + c + "] = " + b + " is largest element in an array");
		inp.close();
	}
}
