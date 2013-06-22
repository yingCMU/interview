
public class Stock {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,2,6,5,0,3};
		System.out.println(maxprofit(input));

	}

	/** best time to buy and sell stocks I
	 * @param args
	 */
	public static int maxprofit(int [] prices){
		if(prices.length == 0)
			return 0;
		int buy = 0, sell = 0, maxdiff = 0 , minI = 0;
		for(int i = 0 ; i < prices.length ; i++){
			if(prices[i] < prices[minI])
				minI = i;
			if((prices[i]-prices[minI]) > maxdiff ){
				buy = minI;
			    sell = i;
			    maxdiff = prices[i]-prices[minI];
			    //System.out.println("maxdiff :" +maxdiff);
			}
		}
		System.out.println("buy : "+buy);
		System.out.println("sell: "+sell);
		// special case [4 ,1], no good match
		return maxdiff > 0? maxdiff:0;
		
		
		
	}
	
	/*
	 *  You may complete as many transactions as you like
	 *  (ie, buy one and sell one share of the stock multiple times). However, you may  not engage 
	 *  in multiple transactions at the same time (ie, you must sell the stock before you buy again).
	 */
	public static int maxProfitII(int [] prices){
		
		
	}
}
