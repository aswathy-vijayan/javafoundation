/**
 * 
 */
package org.ictkerala.exercise;
import java.util.Scanner;
import org.ictkerala.exercise.SumOfTwentyEvenNumbers;
/**
 * 
 */
public class CompoundInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double p, r, n, i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of principal amount");
		p=sc.nextInt();
		
		System.out.print("Enter the value of interest rate");
		r=sc.nextInt();
		
		System.out.print("Enter the number of years of deposit");
		n=sc.nextInt();
		
		i=p*Math.pow(1+r/100, n)-p;
		
		System.out.print("Compound interest = "+i);
		
		sc.close();
		
	}
	

}
