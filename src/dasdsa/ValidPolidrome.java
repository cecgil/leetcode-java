package dasdsa;

public class ValidPolidrome {
	
	public static void main(String[] args) {
		
		ValidPolidrome vp = new ValidPolidrome();
		 boolean res = vp.isPalindrome("A man, a plan, a canal: Panama");
	}
	
    public boolean isPalindrome(String s) {
    	
        String formattedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    	int inicial = 0;
    	int finalString = formattedString.length() - 1;


    	
    	while(inicial < finalString) {
    		if(formattedString.charAt(inicial) != formattedString.charAt(finalString)) {
    			return false;
    		}
    		
    		inicial++;
    		finalString--;
    	}
    	
    	return true;
    }

}
