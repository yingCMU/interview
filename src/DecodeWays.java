
public class DecodeWays {

	/**
	 * @param args
	*/
	private static int decode(String s){
		int [] ways = new int [s.length()];
		if(s == null || s.equals(""))
			return 0;
		if(s.charAt(0)=='0')
			return 0;
		else
			ways[0]=1;
		if(s.length() ==1){
		   return 1;
		}
		
		
		for (int i = 1; i < s.length(); i++){
			ways[i] = 0;
			//"1101"
			if (s.charAt(i)!='0')
				ways[i]+=ways[i-1];
			//System.out.println("1: "+ways[1]);
			
			if(i>=2 ){
				if(valid(s.charAt(i-1),s.charAt(i)))
				ways[i]+=ways[i-2];
			//	System.out.println("2: "+ways[1]);
			
		}
			else //"11,10" special case
				if(valid(s.charAt(i-1),s.charAt(i)))
					ways[i]+= 1;
			//System.out.println("3: "+ways[1]);
		}
		return ways[s.length()-1];
		
		
		
		
	} 
	//(i >= 2 && (s[i-2] == '1' || s[i-2] == '2' && s[i-1] <='6'))
	private static boolean valid(char tenth, char digit){
		
		if(tenth == '1' || (tenth == '2' && digit <='6') )
			return true;
		else return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(decode("10"));
	}

}
