package Exercism;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		FizzBuzz fb = new FizzBuzz();
	
		fb.fizzBuzz(0);
	}

	
    public List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList<>();
        
        for(int i = 0; i <= n; i++) {
        	Integer index = i;
        	res.add(index.toString());
        }
        return res;
    }
	
}
