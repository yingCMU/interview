package javaTEST;
class B extends A { 
	   static void fun() {   
	      System.out.println("B.fun()");
	   }
	
	
		   public static void main(String args[]) {
			   // x is stored using 32 bit 2's complement form. 
		       // Binary representation of -1 is all 1s (111..1)       
		       int x = -2;  
		 
		       System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111
		       System.out.println(x>>29);  // The value of 'x>>>29' is 00...0111
		       System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011 
		       System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001
		      A a = new B();
		      a.fun();  // prints A.fun()
		      B b = new B();
		      b.fun();  // prints B.fun()
		    
		   }
}