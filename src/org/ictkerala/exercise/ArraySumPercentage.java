package org.ictkerala.exercise;
import java.util.Scanner;
public class ArraySumPercentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int[] marks=new int[5];
		int percentage, sum=0;
		System.out.println("enter marks of 5 students");
		for(int i=0;i<5;i++) {
			marks[i]=sc.nextInt();
			sum=sum + marks[i];
			}
			percentage=(sum/5);
			
		
		 System.out.println("sum= "+sum);
		 System.out.println("percentage= " +percentage);
	}

}
