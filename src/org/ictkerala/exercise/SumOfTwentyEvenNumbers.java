package org.ictkerala.exercise;

import java.util.Scanner;


// Read any 20 numbers from the user.  Find the sum of only even numbers from that and display the result. 
// If no even number is entered by the user , it should display a proper message back to user.

public class SumOfTwentyEvenNumbers {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		if (count == 0)
			System.out.print("Enter 20 numbers : ");

		int num = sc.nextInt();

		if (num % 2 == 0)
			sum = sum + num;

		count = count + 1;

		if (count == 20) {
			if (sum == 0)
				System.out.print("No even number(s) entered.");
			else
				System.out.print("Sum of even numbers : " + sum);
			sc.close();
		} else
			main(args);
	}

}
