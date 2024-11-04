package dasdsa;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		RemoveElement re = new RemoveElement();
		int[] teste = {3,2,2,3};
		int val = 3;
		re.removeElement(teste, val);
		
	}
	
    public int removeElement(int[] nums, int val) {
    	
    	int index = 0;
    	for(int i = 0; i < nums.length; i++) { 
    		if(nums[i] != val) {
    			nums[index] = nums[i];
    		    index++;
    		}
    	}
    	
    	return index;
    }

}
