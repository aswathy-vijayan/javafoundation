/**
 * 
 */
package org.ictkerala.algorithm;
import java.util.Scanner;

/**
 * 
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.print("Enter a positive number");
		}
		else {
			if (n == 0) {
				System.out.print("Enter a positive number");
			}
			else { 
				if (n%2 == 0) {
					System.out.print("Entered number is even");
				}
				else {
					System.out.print("Entered number is odd");
				}
			}
			
		}
		
	}

}
