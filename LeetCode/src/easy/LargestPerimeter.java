package easy;

import java.util.Arrays;

public class LargestPerimeter {
	public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 3; i >= 0; i--) {
			if (nums[i] + nums[i + 1] > nums[i + 2])
				return nums[i] + nums[i + 1] + nums[i + 2];
		}
		return 0;
	}

	public static void main(String[] args) {
		LargestPerimeter largestPerimeter = new LargestPerimeter();
		int[] numbers = { 2, 7, 4, 9, 5 };
		System.out.println(largestPerimeter.largestPerimeter(numbers));

	}
}

