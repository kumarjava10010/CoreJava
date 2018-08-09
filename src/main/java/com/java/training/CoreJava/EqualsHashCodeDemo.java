
package com.java.training.CoreJava;

/**
 * @author kmoparti
 *
 */
public class EqualsHashCodeDemo {
	
	public static void main(String[] args) {
        Student alex1 = new Student(1, "Alex", "");
        Student alex2 = new Student(1, "Alex1", "");
        
        String str = "Alex";
        
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        
       // System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(str));

    }

}
