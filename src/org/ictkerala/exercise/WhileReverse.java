package org.ictkerala.exercise;
import java.util.Scanner;


public class WhileReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		int rev=0,temp=num,rem;
		
		while(temp>0) {
			rem=temp%10;
			
			rev=rev*10+rem;
			
			temp=temp/10;
		}
		System.out.println("reversed number = "+rev);
		
	}

}
