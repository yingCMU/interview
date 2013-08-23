
public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
		//System.out.println( minJumps(a,0,0));
		//System.out.println(minJumpsDPMy(a));
		int [] b ={12, 1, 2, 3, 0, 11, 4};
		int [] increasing ={8,100, 200, 600,800, 3, 2, 1};
		//System.out.println(findFirstB(increasing,0,increasing.length-1));
		//change(b);
		//printArray(increasing);
		int[] repeating={1, 2, 3, 1, 3, 6, 6,0,0};
		
		//findRepeat(repeating);
		printArray(reverseWord("love"));
	}
	
	static char [] reverseSentence(String sentence){
		char[] se = sentence.toCharArray();
		int cur = 0;
		int head=0;
		while (cur < se.length){
			
			while(se[cur]!=' ' )
				cur++;
		}
		
		
	}
	
	static char [] reverseWord(String words){
		char [] wordc =words.toCharArray();
		for(int l=0, h= wordc.length-1;l<h; ){
			char temp= wordc[h];
			wordc[h] = wordc[l];
			wordc[l]=temp;
			
			l++;
			h--;
		}
		return wordc;
		
	}
	
	static void findRepeat(int [] a){
		if(a.length<=1)
			return;
		int countzero =0;
		for(int i=0; i< a.length; i++){
			{
				 if (a[Math.abs(a[i])] == 0){
				      countzero++;
				 }
				 else if (a[Math.abs(a[i])] > 0)
			      a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			    else
			      System.out.printf(" %d ", Math.abs(a[i]));
			  }
		}
		if(countzero>0)
			System.out.print(" 0");
			
		
	}
	static int findFirstL(int[] a,int low, int high){
		int max = a[low];
	   for(int i=low+1; i <= high; i++){
		   if (max < a[i])
			   max = a[i];
	   }
	   return max;
		
	}
static int findFirstB(int[] a,int low, int high){
	if (low > high)
		return -1;
	if (low == high)
		return a[low];
	int mid= (low+high)/2;
	if(a[mid-1]<a[mid] ){
		if(a[mid]>a[mid+1])
			return a[mid];
		return findFirstB(a,mid+1,high);
	}
	else{
		return findFirstB(a,low,mid-1);
	
	}
	}
	static void printArray(int[] b){
		for(int  aa: b)
			
			System.out.print(aa+" ");
	}
	static void printArray(char [] b){
		for(char  aa: b)
			
			System.out.print(aa);
	}
	static void change(int [] a){
		a[0]= a[a.length-1];
	}
	static void MIS(int [] a){
		
	}
	static int minJumps(int [] a, int jump, int cur){
		if (cur >= a.length-1){
			
			System.out.println( "end : ele and jump is "+a[cur]+" "+jump);
			return jump;
		}
		int range = a[cur];
		int minjump=a.length;
		for(int i=1; i<= range&& (cur+i)<a.length; i++){
			//System.out.println("for "+i);
				minjump=Math.min(minjump, minJumps(a,jump+1,cur+i));
		}
		System.out.println( "min jump : ele and jump is "+a[cur]+" "+jump);
		return minjump;
					
		
	}
	static int minJumpsDPMy(int [] a){
		int [] b = new int[a.length];
		b[0]=0;
		for(int i=1; i<a.length;i++)
				b[i]=-1;
		
         int jump =0;
        for (int cur=0; cur < a.length; cur++ ){
		int range = a[cur];
		System.out.println(" and range ="+range);
		
		for(int i=1; i<= range&& (cur+i)<a.length; i++){
			System.out.println("for cur"+(i+cur )+" and range ="+range);
				//minjump=Math.min(minjump, minJumps(a,jump+1,cur+i));
				if(b[cur+i]==-1)
					b[cur+i] =b[cur]+1;
				else 
				   b[cur+i]=Math.min(b[cur]+1 ,b[cur+i] );
		}
		
         }
		//System.out.println( "min jump : ele and jump is "+a[cur]+" "+jump);
		return b[a.length-1];
	}
	
	static void countSmaller(int[] arr){
		
	}
	static int minJumpsDP(int[] arr)
	{
	    int [] jumps = new int[arr.length];  // jumps[n-1] will hold the result
	    int i, j;
	 
	    if (arr.length == 0 || arr[0] ==0)
	        return -1;
	 
	    jumps[0] = 0;
	 
	    // Find the minimum number of jumps to reach arr[i]
	    // from arr[0], and assign this value to jumps[i]
	    for (i = 1; i < arr.length-1; i++)
	    {
	        jumps[i] = Integer.MAX_VALUE;
	        for (j = 0; j < i; j++)
	        {
	            if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE)
	            {
	                 jumps[i] = jumps[j] + 1;
	                 break;
	            }
	        }
	    }
	    return jumps[arr.length-1];
	}

}
