package Exercism;

import java.util.Arrays;
import java.util.Iterator;

public class HeightChecker {
	
	
	public static void main(String[] args) {
		int[] teste = new int[] {1,1,4,2,1,3};
		
		height(teste);
		
	}
	
	public static int height(int[] heights) {
		int aux = 0;
		int count = 0;
		
		int[] destinationArray = Arrays.copyOf(heights, heights.length);
		
		for(int i = 0; i < heights.length; i++) {
			for(int j = 0; j < heights.length - 1; j ++) {
				if(heights[j] > heights[j + 1]) {
					aux = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = aux;
				}
			}
		}
		
		for(int i = 0; i < heights.length; i ++) {
			if(heights[i] != destinationArray[i]) {
				count++;
			}
		}
		
		return count;
		
	}

}
