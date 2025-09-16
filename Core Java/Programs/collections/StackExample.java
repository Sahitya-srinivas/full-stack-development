package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("M");
		stack.push("U");
		stack.pop();
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
