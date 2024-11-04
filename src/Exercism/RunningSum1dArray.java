package Exercism;

public class RunningSum1dArray {
	
	public static void main(String[] args) {
		
		
		int[] aa = new int[] {1,2,3,4};
		
		runningSum(aa);
		
	}
	
	public static int[] runningSum(int[] nums) {
		
		int[] res = new int[nums.length];
		
		int prev = 0, curr = 1;
		
		for(int i = 0; i < nums.length; i ++) {
			int aux = curr + prev;
			prev = curr;
			curr = aux;
			
			res[i] = aux;
			System.out.println(res[i]);
		}
		
		
		return res;
	}

}
