package dasdsa;

public class LastLengthWord {
	
	public static void main(String[] args) {
		
		LastLengthWord lsw = new LastLengthWord();
		
		lsw.lengthOfLastWord("hello world");
	}
	
    public int lengthOfLastWord(String s) {
    	
    	Integer count = 0;
    	
    	for(int i = s.length() - 1; i >= 0; i--) {
    		if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
    			count++;
    		} else if (count != 0) {
    			break;
    		}
    	}    	
    	return count;

    }

}
