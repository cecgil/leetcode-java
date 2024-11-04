package Exercism;

public class TimeToBuyAndSell {
	
	public static void main(String[] args) {
		TimeToBuyAndSell ttbas = new TimeToBuyAndSell();
		int[] arr = {7,1,5,3,6,4};
		ttbas.maxProfit(arr);
	}
	
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
