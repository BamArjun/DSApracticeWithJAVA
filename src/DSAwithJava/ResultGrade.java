package DSAwithJava;

import java.util.Scanner;

public class ResultGrade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int marks;
	int input;
	do {
		System.out.println("enter the marks");
		marks=sc.nextInt();
			if(marks>=90 && marks<=100) {
			System.out.println("Marks are good");
		}
		else if(marks>=80 && marks<=90) {
			System.out.println("Marks are also good");
		}
		else if(marks>=35 && marks<=80) {
			System.out.println("you are pass");
		}
		else {
			System.out.println("you are fail");
		}
		
		System.out.println("Do you want to continue yes(1) or no (0)");
		input=sc.nextInt();
		
	}while(input==1);
}
}
