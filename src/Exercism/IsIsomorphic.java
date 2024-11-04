package Exercism;

public class IsIsomorphic {
	
	public static void main(String[] args) {
		IsIsomorphic ii = new IsIsomorphic();
		
		ii.isIsomorphic("foo", "bar");
	}
	
    public boolean isIsomorphic(String s, String t) {
    	
    	   if (s.length() != t.length()) return false;

    	    int[] mapaS = new int[256];
    	    int[] mapaT = new int[256];

    	    for (int i = 0; i < s.length(); i++) {
    	        char charS = s.charAt(i);
    	        char charT = t.charAt(i);

    	        if (mapaS[charS] != mapaT[charT]) {
    	            return false;
    	        }

    	        mapaS[charS] = i + 1;
    	        mapaT[charT] = i + 1;
    	    }

    	    return true;
    }

}
