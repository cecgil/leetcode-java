package Exercism;

import java.util.Arrays;

public class MergeSortedArray {

	/*
	 * Você recebe duas matrizes de inteiros nums1 e nums2, classificadas em ordem não decrescente, e dois inteiros m e n, representando 
	 * o número de elementos em nums1 e nums2 respectivamente.
		Mesclar nums1 e nums2 em uma única matriz classificada em ordem não decrescente.

		O array classificado final não deve ser retornado pela função, mas sim armazenado dentro do array nums1. 
		Para acomodar isso, nums1 tem um comprimento de m + n, onde os primeiros m elementos denotam os elementos que devem ser 
		mesclados e os últimos n elementos são definidos como 0 e devem ser ignorados. nums2 tem um comprimento de n.
	 */
	
	public static void main(String[] args) {
		
		MergeSortedArray msa = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		msa.merge(nums1, 3, nums2, 3);
		
		
	}
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	int index = 0;
    	
    	for(int i = m; i < nums1.length; i++) {
    		nums1[i] = nums2[index];
    		index++;
    	}
    	
    	Arrays.sort(nums1);
    	
    }    	
    	
    	
    	
        
    
}
