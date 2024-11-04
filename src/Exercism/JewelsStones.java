package Exercism;

public class JewelsStones {
	
	public static void main(String[] args) {
		String[] s = new String[] {"--X","X++","X++"};
		finalValueAfterOperations(s);
	}
	
	
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")) {
            	ans++;
            } else {
            	ans--;
            }
        }
        
        return ans;

    }

}
