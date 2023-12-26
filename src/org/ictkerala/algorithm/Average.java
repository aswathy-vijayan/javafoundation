/**
 * 
 */
package org.ictkerala.algorithm;
import java.util.Scanner;
/**
 * 
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total score of students");
		int totalscore=sc.nextInt();
		int averagescore=totalscore/10;
		
		System.out.print("averagescore="+averagescore);
	}

}
