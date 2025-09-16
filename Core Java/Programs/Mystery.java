public class Mystery {
    static String message = "Hello";
 
    static {
        message = "Static Block 1";
        System.out.println("1: " + message);
    }
 
    public static void main(String[] args) {
        Mystery m = new DerivedClass();
        System.out.println("5: " + message);
    }
 
    static {
        message = "Static Block 2";
        System.out.println("2: " + message);
    }
}
 
class DerivedClass extends Mystery {
    static {
        message = "Derived Static Block";
        System.out.println("3: " + message);
    }
 
    {
        message = "Derived Instance Block";
        System.out.println("4: " + message);
    }

	
	
//	public static void swap(Numbers n) {
//	      Integer temp = new Integer(n.a);
//	      n.a = n.b;
//	      n.b = temp;
//	      
//	   }
//	   public static void main(String[] args) {
//	      Integer i = new Integer(10);
//	      Integer j = new Integer(20);
//	      Numbers n = new Numbers(i,j);
//	      swap(n);
//	      System.out.println("i = " + n.a + ", j = " + n.b);
//	   }
//}
//
//class Numbers{
//	Integer a;
//	Integer b;
//	public Numbers(Integer a, Integer b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}
//	@Override
//	public String toString() {
//		return "Numbers [a=" + a + ", b=" + b + "]";
//	}
}