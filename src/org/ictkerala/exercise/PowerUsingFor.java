package org.ictkerala.exercise;
import java.util.Scanner;

public class PowerUsingFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 =sc.nextInt();
		System.out.println("Enter num2");
		int num2 =sc.nextInt();
		int p=1;
		for(int i=1;i<=num2;i++) {
			p=num1*p;
		}
		System.out.println("power ="+p);
				
	}

}
