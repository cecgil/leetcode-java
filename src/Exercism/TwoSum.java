package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	
	public static void main(String[] args) {
		
		
		int target = 9;
		int[] result = new int[2];
		
	    List<Integer> list = Arrays.asList(11,15,2,7);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < list.size() ; i++) {
			if (map.containsKey(target - list.get(i))) {
				result[0] = i;
				result[1] = map.get(target-list.get(i));
				System.out.println("a " + result[0] + "B " +result[1]);
			}
	        map.put(list.get(i),i);

		}
		
		
	}

}
