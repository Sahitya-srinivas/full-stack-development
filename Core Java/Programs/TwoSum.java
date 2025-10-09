import java.util.Arrays;



public class TwoSum {

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
    
    public static void main() {
    	System.out.println("This is user defined main method");
    }

	public static void main(String a[]) {
		StringBuffer sbu = new StringBuffer();
		StringBuilder sbd = new StringBuilder();
		TwoSum ts = new TwoSum();
		int[] arr = {2,7,11,15,6,3,5};
		System.out.println(Arrays.toString(ts.twoSum(arr, 17)));
		main();
	}

}
