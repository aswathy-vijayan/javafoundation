package org.ictkerala.exercise;

import java.util.Scanner;

public class WhilePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int i = 2;
		while(i<num)
		{ 
			if(num%i==0) {
				System.out.println("number is not prime");
				break;
			}
			
				System.out.println("number is prime");
		}
	}

}
