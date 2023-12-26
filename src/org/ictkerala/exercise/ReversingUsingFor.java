package org.ictkerala.exercise;
import java.util.Scanner;
import org.ictkerala.exercise.PrimeOrNotUsingFor;


public class ReversingUsingFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		int rev=0, temp=num, rem=0;

	
		while(temp>0) {
		   rem=temp%10;
		   rev=rev*10+rem;
		   temp=temp/10;
		}
		System.out.println(rev);
		sc.close();
		
		int res = PrimeOrNotUsingFor.add(temp, rem);
	}

}
