package collections;

import java.util.Arrays;

public class Collections1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 5; i > 0; i--) {
			arr[5 - i] = i;
		}
		Arrays.fill(arr, 1, 4, 10);
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
