package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("Fariza");
		queue.add("Maylis");
		queue.add("hello");
		queue.add("World");
		queue.add("mam");


		System.out.println("Queue: " + queue);

		System.out.println("Peek: " + queue.peek());

		System.out.println("Remove: " + queue.remove());

		System.out.println("Queue: " + queue);

		System.out.println("Poll " + queue.poll());
		System.out.println("Poll " + queue.poll());

		System.out.println("Queue: " + queue);
		System.out.println("Remove: " + queue.remove());
		System.out.println("Remove: " + queue.remove());

		queue.add("Fariza");
		queue.add("Maylis");
		queue.add("hello");
		queue.add("World");
		queue.add("mam");

		System.out.println("With for each loop: ");
		for (String S : queue) {
		}
		System.out.println(queue);
		//While loop
		System.out.println("With while loop: ");
		Iterator<String> it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}

}