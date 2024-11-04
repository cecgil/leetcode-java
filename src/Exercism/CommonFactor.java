package Exercism;

public class CommonFactor {
	
	public static void main(String[] args) {
		
		commonFactors(12, 6);
	}
	
	public static int commonFactors(int a, int b) {
		
		int max;
        int count = 0;

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        for(int i = 1; i<max; i++) {
            if(a%i == 0 && b%i  == 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
