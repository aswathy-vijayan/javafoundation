package org.ictkerala.exercise;
import java.util.Scanner;
public class WhileCounting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int count_positive_integers=0;
		int count_negative_integers=0;
		int count_zeroes=0;

		while(true) {
			int num=sc.nextInt();
			if(num>0) {
				count_positive_integers=count_positive_integers+1;
			}
			if(num<0) {
				count_negative_integers=count_negative_integers+1;
				
			}
			if(num==0) {
				count_zeroes=count_zeroes+1;
				
			}
			System.out.println("do you wish to continue? y/n");
			char c=sc.next().charAt(0);
			if (Character.toLowerCase(c) == 'n')
				break;
		}
		
		System.out.println("Number of positive integers = "+count_positive_integers);
		System.out.println("Number of negative integers = "+count_negative_integers);
		System.out.println("Number of zeroes = "+count_zeroes);

	}

}
