package DSAwithJava;

import java.util.Scanner;

public class IsPrimeOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number you want to check");
	int num=sc.nextInt();
	Boolean isPrime=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		if( num==1) {
		System.out.println("The number nither prime not composit");
	}
	else {
		System.out.println("the number is prime");
	}		
}
	else {System.out.println("the number is not prime");}
}
}
