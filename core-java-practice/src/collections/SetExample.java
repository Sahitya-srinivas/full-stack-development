package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		String s = new String("Python");
		hs.add("Java");
		hs.add("Python");
		hs.add("CPP");
		hs.add(s);
		hs.add("Go");
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	System.out.println(hs);
	}

}
