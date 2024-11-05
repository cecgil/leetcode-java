package Exercism;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		FizzBuzz fb = new FizzBuzz();
	
		fb.fizzBuzz(6);
	}

	
    public List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	Integer index = i;
        	if(i % 3 == 0 && i % 5 == 0) {
        		res.add("FizzBuzz");
        		continue;
        	}
        	if(i % 3 == 0) {
        		res.add("Fizz");
        		continue;
        	}
        	if(i % 5 == 0) {
        		res.add("Buzz");
        		continue;
        	}
        	index.toString();
        	res.add(index.toString());
        	
        }
         return res;
    }
	
}
