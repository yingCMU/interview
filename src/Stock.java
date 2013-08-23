
public class Stock {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] input = {9,6,5,0};
		//System.out.println(maxprofit(input));
		
		int[] price = {100, 180, 260, 310, 40, 535, 695,100,50,30};
	    int n = price.length;
	 
	    // fucntion call
	    //System.out.println(price);
	    Interval[]  sol = new Interval[n/2 + 1];
	    for (int j=0;j<(n/2+1);j++)
	    	sol[j]=new Interval();
	    stockBuySell(price, n,sol);

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
	
	static /*
	 *  You may complete as many transactions as you like
	 *  (ie, buy one and sell one share of the stock multiple times). However, you may  not engage 
	 *  in multiple transactions at the same time (ie, you must sell the stock before you buy again).
	 */
	void stockBuySell(int price[], int n,Interval sol[])
	{
	    // Prices must be given for at least two days
	    if (n == 1)
	        return;
	 
	    int count = 0; // count of solution pairs
	 
	    // solution vector
	    
	    // Traverse through given price array
	    int i = 0;
	    while (i < n-1)
	    {
	        // Find Local Minima. Note that the limit is (n-2) as we are
	        // comparing present element to the next element. 
	        while ((i < n-1) && (price[i+1] <= price[i]))
	            i++;
	 
	        // If we reached the end, break as no further solution possible
	        if (i == n-1)
	            break;
	        System.out.println("i is "+i+"  and count is "+count);
	        // Store the index of minima
	        sol[count].buy = i++;
	 
	        // Find Local Maxima.  Note that the limit is (n-1) as we are
	        // comparing to previous element
	        while ((i < n) && (price[i] >= price[i-1]))
	            i++;
	 
	        // Store the index of maxima
	        sol[count].sell = i-1;
	 
	        // Increment count of buy/sell pairs
	        count++;
	    }
	 
	    // print solution
	    if (count == 0)
	        System.out.println("There is no day when buying the stock will make profit\n");
	    else
	    {
	       for (int i1 = 0; i1 < count; i1++)
	    	   System.out.printf("Buy on day: %d\t Sell on day: %d\n", sol[i1].buy, sol[i1].sell);
	    }
	 
	    return;
	}
	
	
	
	
}
