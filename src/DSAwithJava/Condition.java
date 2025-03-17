package DSAwithJava;

import java.util.Scanner;

public class Condition {
public static void main(String[] args) {
	System.out.println("hello");
	Scanner sc =new Scanner(System .in);
	System.out.println("Enter the value of a and b");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter your choice from 1 to 5");
	int n = sc.nextInt();
	switch (n) {
	case 1:
		int sum =a+b;
		System.out.println(sum);
		break;
	case 2:
		int sub =a-b;
		System.out.println(sub);
		break;
	case 3:
		int mul =a*b;
		System.out.println(mul);
		break;
	case 4:
		int div =a+b;
		System.out.println(div);
		break;
	case 5:
		int mod =a%b;
		System.out.println(mod);
		break;
	default:
		System.out.println("invalid input");

		}
	}
}
