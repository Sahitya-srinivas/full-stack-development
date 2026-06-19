package easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;

//		Set<Integer> distinctElements = new HashSet<>();
//		for(int num : nums) {
//			distinctElements.add(num);
//		}
//		return distinctElements.size();
	}

	public static int[] distinctValues(int[] nums) {
		Set<Integer> distinctElements = new HashSet<>();
		for (int num : nums) {
			distinctElements.add(num);
		}
		Object[] values = distinctElements.toArray();
		for (Object num : values) {
			System.out.println(num);
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2 };
		distinctValues(arr);
		System.out.println(removeDuplicates(arr));
	}

}
