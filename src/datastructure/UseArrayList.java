
package datastructure;


import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	ArrayList <String>list = new ArrayList();
		list.add("Fariza");
		list.add("Maylis");
		list.add("Hello");
		list.add("World");
		list.add("Five");
		list.add("six");

		System.out.println("list: " + list);

		System.out.println("Remove: " + list.remove(5));
		System.out.println("list: " + list);
		list.add("six");

		System.out.println("get: " + list.get(3));
		//Didn't qwork with peek'
		//System.out.println("list " + list.peek());

// for each loop:
		System.out.println("With for each loop: ");
		for(String str : list) {
			System.out.println(str);
		}
			//While loop
		System.out.println("With while loop : ");
			Iterator<String> it = list.iterator();
			while(it.hasNext()) {

				System.out.println(it.next());
	}

			}


		}



