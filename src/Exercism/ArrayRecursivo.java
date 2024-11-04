package Exercism;

import java.util.Arrays;

public class ArrayRecursivo {
		
	public static void main(String[] args) {
		
		int[] num = {2,4,6};

		int resultado = soma(num);
		
		System.out.println(resultado);
	}
	
    public static int soma(int[] array) {
        return soma(array, 0);
    }

    // Função recursiva auxiliar
    private static int soma(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + soma(array, index + 1);
    }
	


}
