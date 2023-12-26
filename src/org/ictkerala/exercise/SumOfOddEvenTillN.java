package org.ictkerala.exercise;

import java.util.Scanner;

public class SumOfOddEvenTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int num=sc.nextInt();
		int sumOfEven=0;
		int sumOfOdd=0;
		for(int i=1;i<=num;i++) {
			
			if(i%2==0) {
				sumOfEven=sumOfEven+i;
				
				
			}
		
		else
		{
			sumOfOdd=sumOfOdd+i;
			
	}

	}
		System.out.println("Sum of even"+ sumOfEven);
		System.out.println("Sum of Odd"+ sumOfOdd);


}

	}


