import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,-1,0};
		System.out.println(threeSum(input));
	}
	/*  http://leetcode.com/2010/04/finding-all-unique-triplets-that-sums.html
	 * 
	 * 
	 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
	 *  Find all unique triplets in the array which gives the sum of zero.
	 *  Given a set S of n integers, find all pairs of integers of a and b in S such that a + b = k?
	 * By incorporating the solution above, we can solve the 3sum problem in O(n^2) tim
	 */
	 public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	       // Map<Integer,Boolean>  map = new HashMap<Integer,Boolean>();
		 ArrayList <ArrayList<Integer>> resultList = new ArrayList <ArrayList<Integer>>();
		// Map map = new HashMap<Integer,Boolean>();
		 
	        for(int i=0; i < num.length; i++){
	        	int f = i+1;//front
	        	int r = num.length -1;//rear
	        	int target = - num[i];
	        	while ( f < r){
	        		int sum = num[f]+num[r];
	        		if(sum == target){
	        			ArrayList<Integer> triple = new ArrayList();
	        		    triple.add(num[i]);
	        		   
	        		    triple.add(num[f]);
	        		    triple.add(num[r]);
	        		    resultList.add(triple);
	        		    f++;
	        		    r--;
	        		}
	        		else if (sum > target)
	        			r=r-1;
	        		else 
	        			f = f+1;
	        	}
	        	
	        }
	        	
			return resultList;
	    
	 
	 }
}
