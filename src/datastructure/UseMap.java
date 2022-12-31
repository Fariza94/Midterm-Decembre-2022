package datastructure;

import java.util.*;

public class UseMap {
//https://www.chegg.com/homework-help/questions-and-answers/package-datastructure-public-class-usemap-public-static-void-main-string-args-demonstrate--q58854088
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("s1", "Fariza");
		map.put("s2", "Maylis");
		map.put("s3", "Hello");
		map.put("s4", "World");
		map.put("s5", "zero");

		System.out.println(map);

		System.out.println(map.get("s1"));


		ArrayList<String> str = new ArrayList<>();
		str.add("a1");
		str.add("a2");
		str.add("a3");
		str.add("a4");
		str.add("a5");

		//List<String> List = new HashMap<String, List<String>>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		map1.put("classification ",str);
System.out.println(map1);
		//Use For Each loop and while loop with Iterator to retrieve data.
		//for each loop:
		System.out.println("With for each loop: ");
		for(Map.Entry<String, String> s : map.entrySet()) {
			System.out.println(map);
		}
		System.out.println("With for each loop: ");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//for(String s :str) {
			//System.out.println(s);
		//While loop
		System.out.println("With while loop : ");
		//Iterator<String> it = list.iterator();
		//while(it.hasNext()) {

			//System.out.println(it.next());




	}

}
