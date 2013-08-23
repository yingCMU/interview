
public class DivideConquer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test= {-2,-1};
		//int [] test1= {-3,-2,-1,2,5};
		int [] test1= {-3,1,-1,2,5};
		//System.out.println(firstPositive(test1,0,test1.length-1));
		System.out.println(findPeak(test1,0,test1.length-1));
	}
	static int firstPositive(int [] a,int l,int h){
		System.out.println("L and H :"+l+" "+h);
		if( a[l]>0)
			return a[l];
		if (a[h] <=0)
			return -1;
		int m = (l+h)/2;
		if(a[m]<=0)
			return firstPositive(a, m+1,h);
		else 
			if(a[m+1]>0)
				return a[m+1];
			else 
					
			return firstPositive(a, l,m+1);
		
	}
	static int findPeak(int [] a, int l , int h){
		
		int m = (l+h)/2;
		System.out.println("L and H and m:"+l+" "+h+" "+m);
		if(a.length == 1)
			return a[0];
		if (l  == h)
			return a[l];
		
		if (a[m] > a[m-1] && a[m] > a[m+1])
			return a[m];
		else if(a[m] > a[m-1])
			return findPeak(a, m+1,h);
		else 
			return findPeak(a, l,m-1);
		
	}

}
