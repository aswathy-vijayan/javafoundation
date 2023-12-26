package org.ictkerala.exercise;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number");
		int a=sc.nextInt();
		System.out.print("Enter second number");
		int b=sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("Value of first number : "+ a);
	    System.out.println("Value of second number : "+ b);
	}
}
