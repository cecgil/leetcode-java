package Exercism;

public class ThridMaximumNumber {
	
	public static void main(String[] args) {
		
		ThridMaximumNumber tmn = new ThridMaximumNumber();
		int[] nums = {3,2,1};
		tmn.thirdMax(nums);
	}
	
	
    public int thirdMax(int[] nums) {
    	
    	Integer max3 = null;
    	Integer max2 = null;
    	Integer max1 = null;
    	
    	for(Integer num : nums) {
    		if(num == max3 || num == max2 || num == max1) {
    			continue;
    		}
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
    	}
    	
        return max3 == null ? max1 : max3;

    }	

}
