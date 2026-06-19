package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		int[] arr = new int[] {11,22,33,44,55};
		Vector<Integer> v = new Vector<>();
		Hashtable<Integer,String> h = new Hashtable<>();
					
		v.add(2);
		v.addElement(3);
		v.addFirst(1);
		
		h.put(1, "Java");
		h.put(2, "C");
		h.put(3, "Python");
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<arr.length;i++) {
			al.add(arr[i]);
		}
		
		System.out.println("Array elements: "+al+"\nVector elements: "+v+"\nHashtable elements: "+h);
		
	}

}
