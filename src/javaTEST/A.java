package javaTEST;

class A {
	   static void fun() {
	      System.out.println("A.fun()");
	   }
	   public static void main(String args[]) {
		      A a = new A();
		      A.fun();  // prints A.fun()
		   }
	}
