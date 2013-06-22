
public class Decode {

	/**
	 * great working C++ codes !!!!!!!!!!!!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int decode(String s){
	int n = s.length();
	  if (n == 0)
	    return 0;
	  int c[n];
	  c[0] = 1;
	  for(int i = 1; i <= n; i++ ) {
	    int c1 = 0;
	    if (s[i-1] != '0')
	      c1 = c[i-1];
	    int c2 = 0;
	    if (i >= 2 && (s[i-2] == '1' || s[i-2] == '2' && s[i-1] <='6'))
	        c2 = c[i-2];
	    c[i] = c1 + c2;
	  }

	  return c[n];
	}
}
