package org.ictkerala.exercise;
import java.util.Scanner;

public class PrimeOrNotUsingFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		String a = "prime";
		for(int i=2;i<num;i++) {
		  if (num%i==0) {
			  a = "not prime";
			  break;
		  }
		}
		System.out.println("number entered is " + a);
		sc.close();
		int c =5, d = 6;
		int r = PrimeOrNotUsingFor.add(c, d);
	}
	
	public static int add(int f, int j) {
		int cc = f + j;
		return(cc);	
	}
	private void test() {
		System.out.println("Test");
	}
}
