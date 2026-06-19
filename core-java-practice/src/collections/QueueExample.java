package collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		pQueue.addAll(Arrays.asList(46,27,38,92,59,76,65));
		System.out.println(pQueue.peek());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.peek());
		
		ArrayDeque<String> aDeque = new ArrayDeque<>();
		aDeque.add("List");
		aDeque.add("Set");
		aDeque.add("Map");
		aDeque.add("Queue");
		System.out.println(aDeque);
		aDeque.clear();
		aDeque.addFirst("ArrayList");
		aDeque.addFirst("Hashtable");
		aDeque.addLast("HashMap");
		aDeque.addLast("Dictionary");
		System.out.println(aDeque);
	}
}


