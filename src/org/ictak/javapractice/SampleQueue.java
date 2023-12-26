package org.ictak.javapractice;
import java.util.Queue;
import java.util.LinkedList;


public class SampleQueue {

	public static void main(String[] args) {
		Queue<String> name=new LinkedList<>();
		name.add("Anagha");
		name.add("Benny");
		name.add("Babitha");
		name.add("Ratish");
		
		System.out.println(name);
		System.out.println(name.remove());
		System.out.println(name.size());
	}
}
