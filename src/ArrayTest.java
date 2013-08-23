
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,3,4,5,7};
		int [] arr2 = {2, 3, 5, 7,8 ,9,10,1};
		//printArray(segragate(arr));
		//printArray(sort012(arr));
		/*int target = 0;
		int result = bsCeil(arr, target);
		if (result >= 0)
			System.out.println(arr[result]);
		else
			System.out.println("nothing ");
			*/
		//intersection(arr1, arr2);
		//maxDiff(arr1);
		//leader(arr1);
		//minDist(arr1, 3,10);
		System.out.println( findMin(arr1,0, arr1.length-1));

	}
	static int findMin(int [] a, int l, int  h){
		int m=(h+l)/2;
		System.out.println("l m h  : "+l+"  "+m+"  "+h);
		if(h<l){// very import for array not rotated at all
			System.out.println("H<L ");
			return a[0];
		}
		if(h==l)
			return a[l];
		
	
		if (m<h&&a[m] > a[m+1])
			return a[m+1];
		if( m>l&&a[m-1]>a[m])// m>l saves everything, why?
			return a[m];
		if(a[m] < a[h])
			return findMin(a, l, m-1);
		else return findMin(a, m+1,h);
		
	}
	static void minDist(int [] a, int t1, int t2){
		int i1=-1, i2=-1;
		int minDiff=a.length-1;
		for(int i =0; i < a.length; i++){
			if( a[i] == t1){
				i1 = i;
				if(i2 >=0)
					minDiff= Math.min( minDiff, Math.abs( i1 - i2 ));
					
			}
			if(a[i] == t2){
				i2=i;
				if(i1 >=0)
					minDiff = Math.min(minDiff, Math.abs(i1-i2));
			}
			
		}
		System.out.println("minDiff is "+minDiff);
		
	}
	static void leader(int [] a){
		int max = a[a.length-1];
		for (int i = a.length-1; i>=0; i--){
			if(a[i] > max)
				System.out.print(a[i]+" ");
			max = Math.max(a[i], max);
			
			
			
		}
		
	}
	static void maxDiff(int [] a){
		if (a.length <=1)
			return ;
		
		int maxDiff = a[1]-a[0];
		int min = a[0];
		int max = a[0];
		for(int i = 2; i < a.length ; i++){
			int temp =  a[i]-min;
			if( temp > maxDiff){
				maxDiff = temp;
				max =a [i];
			}
			min = Math.min(min, a[i]);
			
		}
		System.out.println("maxDiff is "+maxDiff);
		System.out.println("min is "+min);
		System.out.println("max is "+max);
		
	}
	static void intersection(int [] a, int [] b){
		int ai=0, bi=0;
		
		while(ai < a.length && bi < b.length){
			
			if(a[ai] < b[bi])
				ai++;
			else if(a[ai] > b[bi])
				bi++;
			else{
				System.out.print(a[ai]+" ");
				ai++;
				bi++;
			}
				
		}
		
	}
/*
	static int [] sort012v2(int [] a){
		int l=0,m=0;
		int h=a.length-1;
		while ( m <h){
		
		if(a[m]==0)
			int temp=a[m]
		}
	}
	*/
	/*
	 * return index of ceil
	 */
	static int bsCeil(int [] a, int target){
		if(target > a[a.length-1])
			return -1;
		if(target <= a[0])
			return 0;
		int s=0;
		int e= a.length-1;
		while( s <=e){
			int m = (s+e)/2;
			if(a[m] > target){
				if(a[m-1] < target)
					return m;
				if(a[m-1]  == target)
					return m-1;
				else
					e = m-1;
				continue;
			}
			if(a[m]== target)
				return m;
			else{//a[m] < target
				s=m+1;
				
			}
				
			
		}
		return -1;
			
		
		
		
		
	}
	static int [] sort012( int [] a){
		int l=0;
		int h= a.length-1;
		while (a[l]==0)
			l++;
		int m = l;
		while (m < h){
			while(a[h]==2)
				h--;
			
			while ( a[m] ==1)
				m++;
			if( m < h)
				if ( a[m] == 0){
					a[l]=0;
					a[m]=1;
					l++;
					m++;
				}
			    if( a[m] ==2){
			    	//()a[h]=2;
			    	if ( a[h] == 1){
			    		a[m]=1;
			    		m++;
			    		a[h]=2;
			    		h--;
			    	}
			    	if( a[h] == 0){
			    		a[l]=0;
			    		l++;
			    		a[m]=1;
			    		m++;
			    		a[h]=2;
			    		h--;
			    	}
			    	
			    				
			    }
					
		}
		return a;
		
	}
	static int []  segragate(int [] a){
		int l=0;
		int h=a.length-1;
		
		while(l < h){
			while(a[l]==0)
				l++;
			while (a[h] ==1 )
				h--;
			if(l<h){
				a[l]=0;
			    a[h]=1;
			}
				
		}
		return a;
		
	}
	static void printArray(int[] b){
		for(int  aa: b)
			
			System.out.print(aa+" ");
	}
}
