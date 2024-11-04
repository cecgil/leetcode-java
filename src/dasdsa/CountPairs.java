package dasdsa;

import java.util.Arrays;
import java.util.List;

public class CountPairs {
	
	public static void main(String[] args) {
		CountPairs countPairs = new CountPairs();
		
        List<Integer> integers = Arrays.asList(-1,1,2,3,1);
		
		countPairs.countPairs(integers, 2);
		
	}
	
	public int countPairs(List<Integer> nums, int target) {
		
		/*
		 * retornar pars (i, j) onde 0 <= i < j < n e nums[i] + nums[j] < target
		 * (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
		 * 0 <= i < j < n
		 */
		int count = 0;
		for(int i = 0; i < nums.size(); i++) {
			for(int j = 0; j < nums.size(); j++) {
				if(i < j && nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}

}
