package Exercism;

public class PlusOne {
	
	public static void main(String[] args) {
	
		PlusOne po = new PlusOne();
		
		
		
	}
	
    public int[] plusOne(int[] digits) {
    	
    	for(int i = digits.length - 1; i >= 0; i--) {
    		if(digits[i] != 9) {
    			digits[i]++;
    			return digits;
    		}
    		
    		digits[i] = 0;
    	}
    	
    	digits = new int[digits.length + 1];
    	digits[0] = 1;
    	return digits;
        
    }

}
