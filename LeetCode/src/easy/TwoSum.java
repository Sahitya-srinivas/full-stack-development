package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// Brute force
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
             for(int j = 0; j < nums.length-1;j++){
                 if(nums[i]+nums[j]==target){
                     result[0] = j;
                     result[1] = i;
                     break;
                 }
             }
        } 
        return result;
     }  
    
    // Optimized
    public int[] twoSum1(int[] nums, int target) {
    	Map<Integer,Integer> numToIndex = new HashMap<>();
    	for(int i = 0;i<nums.length;i++) {
    		if(numToIndex.containsKey(target-nums[i]))
    			return new int[] {numToIndex.get(target-nums[i]),i};
    		numToIndex.put(nums[i], i);
    	}
    	return new int[] {};
    }

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] arr = {2,7,11,15,6,3,5};
		System.out.println(Arrays.toString(ts.twoSum1(arr, 17)));
	}

}
