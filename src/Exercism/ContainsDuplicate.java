package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
	    List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
	    List<Integer> list2 = new ArrayList<Integer>();
	   
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (Integer i : list) {
			if (set.contains(i)) {
				list2.add(i);
			} else {
				set.add(i);
			}
		}
	    	if (!list2.isEmpty()) {
	    		System.out.println("Iguais");
	    	}
	}
	
}
