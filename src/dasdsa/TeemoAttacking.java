package dasdsa;

import java.util.ArrayList;
import java.util.List;

public class TeemoAttacking {
	
	public static void main(String[] args) {
		
		TeemoAttacking ta = new TeemoAttacking();
		int[] timeS = {1,2,3,4,5,6,7,8,9};
		int duration = 1;
		
		
		int res = ta.findPoisonedDuration(timeS, duration);
		System.out.println(res);
		
	}
	
	public int findPoisonedDuration(int[] timeSeries, int duration) {
	    
		if(duration == 0 ) return 0;
		
		List<Integer> res = new ArrayList<Integer>();
		duration = duration - 1;
		
		for(int i = 0; i < timeSeries.length; i++) {
			if(!res.contains(timeSeries[i])) {
				res.add(timeSeries[i]);
			}
			
			if(duration != 0) {
				res.add(timeSeries[i] + duration);
			}
			
			
		}
						
		return res.size();
	}
	

}
