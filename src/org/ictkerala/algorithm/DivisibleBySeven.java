package org.ictkerala.algorithm;
import java.util.Scanner;

public class DivisibleBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int num=sc.nextInt();
		
	if(num%7==0) {
		System.out.print("number entered is divisible by 7");
	}
	else {
		System.out.print("number entered is not divisible by 7");
	}
	}

}
