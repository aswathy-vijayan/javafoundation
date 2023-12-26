package org.ictkerala.exercise;

import java.util.Scanner;

// An assessment test was conducted by the teacher for her students. 
// There were only 10 students in the class.
// She wants to know the average performance score in that batch.  
// Solve this using Java Learning

public class AverageScore {
	static int total_score = 0, count = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		if (count == 0)
			System.out.print("Enter the marks of ten students : ");
		int mark = sc.nextInt();
		count = count + 1;
		total_score = total_score + mark;
		if (count == 10) {
			int average = total_score / 10;
			System.out.print("Average mark of students : " + average);
		} else
			main(args);
	}
}
