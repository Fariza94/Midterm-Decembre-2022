package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String str = "";
		String store = "";
		try {
			fr = new FileReader(textFile);


			try {
				br = new BufferedReader(fr);
				while ((str = br.readLine()) != null){
					store  += str;
					// System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if(br != null){
						br.close();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
// store each word from complete text in storeArray

		String[] storeArray = store.split(" ");

// empty stack and list

		Stack<String> stack = new Stack<String>();

		LinkedList<String> list = new LinkedList<String>();

// store each word to stack and list

		for (String element : storeArray) {

// as specified in question stack add, push to add element

			list.add(element);

			stack.push(element);

		}

// retrieve FIFO order form linked list

		System.out.println("LinkedList FIFO : ");

		System.out.print (list.remove() + " ");

		while (!list.isEmpty())

			System.out.print (list.remove() + " ");

		System.out.println();

// since stack if LIFO

		System.out.println("Stack FILO : ");

		while (!stack.isEmpty()) {

			System.out.print(stack.pop() + " ");

		}

// formatted output

		System.out.println();
	}
	}






