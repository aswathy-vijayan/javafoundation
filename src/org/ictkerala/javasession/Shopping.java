/**
 * 
 */
package org.ictkerala.javasession;
import java.util.Scanner;
/**
 * 
 */
public class Shopping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to abc store");
		Scanner sc = new Scanner(System.in);
		System.out.println("Total rupes in hand :");
		int total = sc.nextInt();
		int p1=30, p2=40, p3=50;
		
		System.out.println("Number of toy_1 want : ");
		int toy_1_num = sc.nextInt();
		System.out.println("Number of toy_2 want : ");
		int toy_2_num = sc.nextInt();
		System.out.println("Number of toy_3 want : ");
		int toy_3_num = sc.nextInt();

		System.out.print("Enter the amount in hand : ");
		
		
		int sum = p1*toy_1_num + p2*toy_2_num + p3*toy_3_num;
		int balance = total - sum;

		System.out.println("The billed amount is : " + sum + " and the reamaining amount is : "+ balance);
	}

}
