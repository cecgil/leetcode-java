package Exercism;

import java.util.Arrays;

public class Fibbonacci {
	
	public static void main(String[] args) {
		
		fibo(5);
		
		
	}
	
	public static int[] fibo(int num) {
		
		int[] res = new int[num];
		
		int prev = 0, curr = 1;
		
		for(int i = 0; i < num; i ++) {
			int aux = curr + prev;
			prev = curr;
			curr = aux;
			
			res[i] = aux;
		}
		
		System.out.println(Arrays.toString(res));
		
		return res;
	}

}
