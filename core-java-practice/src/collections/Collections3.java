package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections3 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		String str1 = "Hello World! \"Java\" is fun";
		for(char c : str1.toCharArray())
			l1.add(c);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		String str2 = "Java Programmimg is Worth";
		for(int i = 0;i<str2.length();i++)
			l2.add(str2.charAt(i));
		System.out.println(l2);
		
		Iterator i = l2.iterator();
		while(i.hasNext()) {
			if(i.next().equals('o'))
				System.out.println("O has found");
		}
	}
}