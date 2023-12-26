/**
 * 
 */
package org.ictkerala.exercise;
import java.util.Scanner;
/**
 * 
 */
public class SimpleInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of principal amount");
		int p=sc.nextInt();
		System.out.print("Enter the value of interest rate");
		int r=sc.nextInt();
		System.out.print("Enter the number of years of deposit");
		int n=sc.nextInt();
		int i=p*n*r/100;
		System.out.print("Simple interest = "+i);
		sc.close();
		
	}

}
