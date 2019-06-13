package Repl;

import java.util.Arrays;

public class Repl130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inner = { -1, 0, 3, 12 };
		int[] outer = { -1, 0, 3, 3, 3, 10, 12 };

		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE

		int count = 0;

		for (int i = 0; i < inner.length; i++) {
			if (Arrays.binarySearch(outer, inner[i]) >= 0) {
				System.out.println(inner[i]);
				count++;

				continue;
			}
		}

		System.out.println(count==);

	}

}
