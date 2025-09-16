package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections2 {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add("Java is Fun");
		l.add(25);
		l.add(true);
		l.add('S');
		l.add(9.5);
		Collections.shuffle(l);
		Collections.reverse(l);
		Iterator<Object> i = l.iterator();
		while (i.hasNext())
			System.out.println(i.next());
			
	}
}








































