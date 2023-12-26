package org.ictak.javapractice;
import java.util.LinkedList;


public class SampleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name=new LinkedList<>();
		name.add("Anagha");
		name.add("Benny");
		name.add("Babitha");
		name.add("Ratish");
		name.add(1,"Remya");
		
		
		
		System.out.println(name);
		System.out.println(name);
		System.out.println(name.get(2));
		name.set(2,"Sajmi");
		System.out.println(name);
		name.remove(2);
		System.out.println(name);
	}

}
