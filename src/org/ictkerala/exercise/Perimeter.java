/**
 * 
 */
package org.ictkerala.exercise;
import java.util.Scanner;
/**
 * 
 */
public class Perimeter {

	/**+
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the rectangle");
		int length=sc.nextInt();
		System.out.print("Enter the breadth of the rectangle");
		int breadth=sc.nextInt();
		int perimeter=2*(length+breadth);
		System.out.print("Perimeter of the rectangle = "+perimeter);
		sc.close();
	}
}
