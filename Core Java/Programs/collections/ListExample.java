package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		
//		List<Integer> al = new ArrayList<>();
//		for(int i = 1; i <= 5;i++) {
//			al.add(i);
//		}
//		al.addFirst(30);
//		System.out.println(al);
//		
//		al.remove(2);
//		System.out.println(al);
//		
//		al.remove(Integer.valueOf(4));
//		System.out.println(al);
//		
//		List<Integer> ll = new LinkedList<>();
//		ll.add(23);
//		ll.addAll(Arrays.asList(67,45,98,34));
//		ll.add(3, 71);
//		System.out.println(ll);
//		
//		System.out.println(ll.get(2));
//		
//		List<Integer> v = new Vector<>();
//		v.addAll(Arrays.asList(10,20,30,40,50));
//		System.out.println(v);
		
		Stack<String> books = new Stack<>();
		books.push("Telugu");
		books.addAll(Arrays.asList("Maths","Physics","Biology","Chemistry"));
//		System.out.println(books);	
//		System.out.println(books.pop());
//		System.out.println(books);
		
//		Iterator<String> iterator = books.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		for(int i = 0;i< books.size();i++) {
			books.add(i, books.get(i)+"-5");
		}
		System.out.println(books);
	}
}
