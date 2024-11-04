package Exercism;

public class leftRightDifference {
	
	
	public static void main(String[] args) {
		
		
		int[] nums = new int[] {10,4,8,3};
		
		leftRightDifference(nums);
		
	}
	
	public static int[] leftRightDifference(int[] nums) {
		
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		
		int[] res = new int[nums.length];
		
		leftSum[0] = 0;
		rightSum[nums.length -1] = 0;
		
		for(int i = 1; i < nums.length; i++) {
			leftSum[i] = nums[i-1] + nums[i]; 
		}
		
		for(int i = nums.length - 2; i > 0; i--) {
			rightSum[i] = nums[i + 1] + rightSum[i + 1];
			
		}
		
		return res;
	}
	

}
