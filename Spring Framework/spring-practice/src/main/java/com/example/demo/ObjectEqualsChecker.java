package com.example.demo;

import org.openjdk.jol.vm.VM;
import org.springframework.stereotype.Component;

@Component

public class ObjectEqualsChecker {

	 public static boolean returnValue(String a, String b){
	        System.out.println("Hashcode of a: "+System.identityHashCode(a)+"\nHashcode of b: "+System.identityHashCode(b));
	        if(a==b)
	            return true;
	        return false;
	    }
	 
	 
	 public void displayHashCode() {
	        String a = "ABCD";
	        String b = new String("ABCD");
	        System.out.println(returnValue(a,b));
	        System.out.println("Hashcode of a: "+a.hashCode()+"\nHashcode of b: "+b.hashCode());
	        System.out.println(VM.current().addressOf(a)+"\n"+VM.current().addressOf(b));
	   }
}