package com.java.training.CoreJava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String args[]){  
	  
	ArrayList list=new ArrayList();//Creating arraylist  
	  
	list.add("Ravi");//Adding object in arraylist  
	
	list.add("Vijay");  
	
	list.add("Ravi");  // Duplicate Object
	
	list.add("Ajay"); 
	  
	  //Traversing list through Iterator  
	  
	  Iterator itr=list.iterator(); 
	  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());
	   
	  } 
	  System.out.println("******************");
	  
	  //list.remove(2);
	  
	  
	  // another way to iterate the list - for loop
	  for(int i = 0; i < list.size(); i++) {  
		  if(list.get(i).equals("Ajay")) {
			  list.remove(i);
		  }
	   System.out.println(list.get(i));  
	  } 
	  
	  System.out.println("******************");
	  
	  //Example 3
	  
	  ArrayList removeList=new ArrayList();  
	  removeList.add("Ravi");  
	  removeList.add("Vijay"); 
	  
	  list.removeAll(removeList);  
	  
	  
	  // another way to iterate the list - for loop
	  for(int i = 0; i < list.size(); i++) {  
	   System.out.println(list.get(i));  
	  } 
	  
	}
}
