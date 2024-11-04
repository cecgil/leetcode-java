package Exercism;

public class Demo {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,0,65,8,0,2,3};
		int i = 0; 
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }

	}


