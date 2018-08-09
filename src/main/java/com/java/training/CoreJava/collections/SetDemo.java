package com.java.training.CoreJava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String args[]) {

		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi"); // Duplicate Element
		set.add("Ajay");

		// Traversing elements
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Ex 2 - TreeSet
		System.out.println("**** Tree set Example ****");

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Ravi");
		treeSet.add("Vijay");
		treeSet.add("Ravi");
		treeSet.add("Ajay");
		// Traversing elements
		Iterator<String> itr1 = treeSet.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("**** ForEach Iteration ****");

		for (String name : treeSet) {
			System.out.println(" for each Name : "+name);
		}

	}
}
