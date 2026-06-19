package collections;

import java.util.LinkedList;

public class HashCodeExample {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		String str = "Java Programming";
		System.out.println(str.hashCode());
		linkedList.add("Priya");
		System.out.println(linkedList.hashCode());
		linkedList.clear();
		System.out.println(linkedList.hashCode());
		linkedList.add("Java");
		System.out.println(linkedList.hashCode());
		linkedList.clear();
		System.out.println(linkedList.hashCode());
	}
}
