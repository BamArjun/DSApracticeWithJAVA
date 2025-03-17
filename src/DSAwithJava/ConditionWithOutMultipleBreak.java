package DSAwithJava;

import java.util.Scanner;

public class ConditionWithOutMultipleBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.println("enter the day choise between 1 to 7");
		int day=sc.nextInt();
		String daytype;
		String dayname;
		switch (day) {
		case 1:
			dayname="sunday";
			System.out.println(dayname);
			break;
		case 2:
			dayname="monday";
			System.out.println(dayname);
			break;
		case 3:
			dayname="tuesday";
			System.out.println(dayname);
			break;
		case 4:
			dayname="wednesday";
			System.out.println(dayname);
			break;
		case 5:
			dayname="thursday";
			System.out.println(dayname);
			break;
		case 6 :
			dayname="friday";
			System.out.println(dayname);
			break;
		case 7:
			dayname="saturday";
			System.out.println(dayname);
			break;
		default:
			dayname="invalid day";
			break;
		}
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		daytype="workday";
		break;
		case 6:
		case 7:
			daytype="weakend";
			break;

		default:
			daytype="invalid daytype";
			break;
		}
		System.out.println(dayname+" is "+daytype);
	}

}
