package Exercism;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		
		int i, n;
		
		int f = 1;
		
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um numero");
			n = scan.nextInt();
			
			for (i = 1; i <= n; i++) {
				f *= i;
			}
			
			System.out.println(f);

		}
				
		
	}

}
