package org.ictkerala.exercise;
import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ten numbers");
		
		int sumOfEven=0;
		int sumOfOdd=0;
		for(int i=1;i<=10;i++) {
			int num=sc.nextInt();
			if(num%2==0) {
				sumOfEven=sumOfEven+num;
				
				
			}
		
		else
		{
			sumOfOdd=sumOfOdd+num;
			
	}

	}
		System.out.println("Sum of even"+ sumOfEven);
		System.out.println("Sum of Odd"+ sumOfOdd);


}
}