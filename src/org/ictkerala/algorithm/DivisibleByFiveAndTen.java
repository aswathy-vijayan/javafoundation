package org.ictkerala.algorithm;
import java.util.Scanner;


public class DivisibleByFiveAndTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if ((num%5 == 0) && (num%10 == 0)){
			System.out.print("The number is divisible by both 5 and 10");
		}
		else {
			System.out.print("Number is not divisible by 5 and 10");
		}

	}

}
