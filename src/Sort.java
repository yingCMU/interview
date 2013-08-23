
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {2,8,22,33,1,4,9,10};
		//int [] input ={1,4,2};
		//System.out.println(mergesort(input, 0, input.length));
		//mergesort(input,0,input.length-1);
		quickSort(input,0,input.length-1);
		for(int i =0; i< input.length; i++)
			System.out.print(" "+input[i]);

	}

	
	public static void quickSort(int [] a, int start, int end){
		if(start>=end)
			return;
		System.out.println("into new!! s and e is :?"+start+" "+end+"  element is+ "+ a[start]+" "+a[end]);
		int pivot = a[start];
		int s= start;
		int e=end;
		while(s<e){
			
			while((a[s]<pivot)){
				s++;
				System.out.println("1 s and e :"+s+" "+e);
			}
			while((a[e]>pivot)){
				
				e--;
				System.out.println("2 s and e :"+s+" "+e);
			}
			if(s<e){
				int temp = a[e];
				a[e]=a[s];
				a[s]=temp;
				
			}
			System.out.println("WHILE END S AND E :"+s+" "+e);
			
		}
		
		quickSort(a,start,s);//?? when s not s-1
		quickSort(a,s+1,end);
		
	}

	public static void mergesort(int[] a, int start, int end){
		if(start >= end)
			return;
		int mid= (start+end)/2;
		mergesort(a,start,mid);
		mergesort(a,mid+1,end);
		merge(a,start,mid+1,end);
	}
	private static void merge(int[] a, int low,int high,int end) {
		// TODO Auto-generated method stub
		int length = end-low+1;
		int[] c= new int[length];
		int rightStart = high;
		int leftStart = low;
		int ci= 0;
		while(low < rightStart && high <=end){
			//System.out.println("low and high :"+a[low]+"  "+a[high]);
			if (a[low]<a[high])
				c[ci++]= a [low++];
			else c[ci++] = a[high++];
			
				
			
		}
		while(low < rightStart)
			c[ci++]=a[low++];
		while (high <= end)
			c[ci++]=a[high++];
		for(int j=0;j<length;j++)
			a[leftStart+j]=c[j];
		
		
	}


	public static void merge(int[] a, int[] b){
		int al = a.length;
		int bl = b.length;
		int ai = 0,bi=0, ci =0;
		int[] c = new int[a.length+b.length];
		while(ai <a.length && bi < b.length){
			if( a[ai] < b [bi]){
				c[ci++] = a[ai++];
			System.out.print(" "+c[ci-1]);}
			else{
				c[ci++] = b[bi++];
				System.out.print(" "+c[ci-1]);
			}
				
		}
		while (ai <a.length){
			c[ci++] = a[ai++];
			System.out.print(" "+c[ci-1]);
		}
		while (bi <b.length){
			c[ci++] = b[bi++];
			System.out.print(" "+c[ci-1]);
		}
	    for(int i=0; i<c.length;i++);
	    	//System.out.print(" "+c[i]);
	}
			
	
}
