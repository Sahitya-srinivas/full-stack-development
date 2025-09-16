package coreJava;

import jakarta.annotation.PostConstruct;

public class BlockExecution {
	
    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct method executed");
    }
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method executed");
    }
    // Static block
    static {
        System.out.println("Static block executed\n");
    }
    // Constructor
    public BlockExecution() {
        System.out.println("Constructor executed");
    }
    // Static method
    public static void staticMethod() {
        System.out.println("Static method executed");
    }
    // Instance initialization block
    {
        System.out.println("Instance initialization block executed");
    }
    public static void main(String[] args) { 
    	  
    	System.out.println("First Set of Execution ------------------>");
        BlockExecution.staticMethod();
        BlockExecution obj1 = new BlockExecution();
        obj1.instanceMethod();
        
        System.out.println("\nSecond Set of Execution --------------->");
        BlockExecution obj2 = new BlockExecution();
        BlockExecution.staticMethod();
        obj2.instanceMethod();
        
        System.out.println("\nThird Set of Execution ---------------->");
        BlockExecution obj3 = new BlockExecution();
        obj3.instanceMethod();
        BlockExecution.staticMethod();
    }
}