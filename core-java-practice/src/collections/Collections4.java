package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Collections4 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		String str = "Javaprogrammingisrealfun";
		for(char c : str.toCharArray()) {
			l.add(c);
		}
		LinkedList a = new LinkedList();
		a.add('g');
		a.add('f');
		a.add('p');
		a.add('m');
		System.out.println(l.contains('J'));
		l.retainAll(a);
		Collections.sort(l);
		System.out.println(l);
	}
}
