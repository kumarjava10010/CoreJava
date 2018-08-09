package com.java.training.CoreJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		//3 differents ways to iterate over the map
		
		System.out.println("Iteration 1 Example");
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	    System.out.println("");
		System.out.println("Iteration 2 Example");
		
		/*Set obj = hm.keySet();
		
		for(int key=0;key<obj.size(); key++) {
	        System.out.println(hm.get(key));

		}*/

	    for (Integer key : hm.keySet()){
	        //iterate over keys
	        System.out.println(key+" "+hm.get(key));
	    }
	    System.out.println("");

	    System.out.println("Iteration 3 Example");

	    for (String value : hm.values()){
	        //iterate over values
	        System.out.println(value);
	    }
		
		
	}
}
