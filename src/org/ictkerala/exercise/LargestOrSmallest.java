package org.ictkerala.exercise;
import java.util.Scanner;

public class LargestOrSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int l=Integer.MIN_VALUE, s=Integer.MAX_VALUE;

		while(true) {
			int num=sc.nextInt();
			if (num>l)
				l = num;
			if (num < s)
				s = num;

			System.out.println("do you wish to continue? y/n");
			char c=sc.next().charAt(0);
			if (Character.toLowerCase(c) == 'n')
				break;
		}
		System.out.println("Largerst Number : " + l);
		System.out.println("Smallest Number : " + s);
		sc.close();
		
	}

}
