package javaTEST;

public class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Test Constructor called");
    }
    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
     }
    public static void main(String args[]) {
    	 
        // Although we have two objects, static block is executed only once.
       //	 Test t1 = new Test();
        //Test t2 = new Test();
    	/*final int [] i = {10,11,12};
        i[1] = 30; // Error because i is final.
        System.out.println(i[1]);
        */
    	Test test= new Test();
    	Test.Derived d = test.new Derived();
        /*
         * Integer i = new Integer(10);
      
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
        */
    
     }
    interface TestInterface {
    	  int x = 10;  // x is public static final and must be initialized here
    	  void foo();  // foo() is public
    	}
    
    class Base {
    	  Base() {
    	    System.out.println("Base Class Constructor Called ");
    	  }
    	}
    	 
    	class Derived extends Base {
    	  Derived() {
    	    System.out.println("Derived Class Constructor Called ");
    	  }
    	}
    
}
 
