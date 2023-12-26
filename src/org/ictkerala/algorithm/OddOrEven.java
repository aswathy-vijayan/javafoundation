package org.ictkerala.algorithm;
import java.util.Scanner;


public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.print("entered number is even");
		}
		else {
			System.out.print("entered number is odd");
		}
		}
	}