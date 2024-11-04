package Exercism;

public class negativeInMatrix {
	
	public static void main(String[] args) {
		int[][] matrix =  {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
		};
		
		countNegatives(matrix);
		
	}

	
	public static int countNegatives(int[][] grid) {
		int count = 0;
		
		for(int[] linha : grid) {
			for(int i : linha) {
				if(i < 0) {
					count++;
				}
			}
		}
		
		return count;
	}
	
}
