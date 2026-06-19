package easy;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {
	public int[] runningSum(int[] nums) {
		int length = nums.length;
		for (int i = 1; i <= length - 1; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}
		return nums;
	}

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i <= n-1; i++) {
        	System.out.print("Enter the element "+(i+1)+": ");
        	input[i] = sc.nextInt();
        }
        RunningSumOf1DArray obj = new RunningSumOf1DArray();
        System.out.println("Result is: "+Arrays.toString(obj.runningSum(input)));
        sc.close();
    }
}
