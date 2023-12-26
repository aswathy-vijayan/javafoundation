package org.ictkerala.algorithm;
import java.util.Scanner;


public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the age");
		int age=sc.nextInt();
		if (age>=18)
		{
			System.out.print("you are eligible for voting");
		}
		else {
			System.out.print("you are not eligible for voting");
		}
	}

}
