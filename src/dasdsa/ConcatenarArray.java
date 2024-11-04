package dasdsa;

public class ConcatenarArray {

	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		
		int[] ans = new int[nums.length * 2];
		
		for(int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		
			
		
	}
	
	
}
