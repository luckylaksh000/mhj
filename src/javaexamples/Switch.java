package javaexamples;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Add");
		System.out.println("2Sub");
		System.out.println("3Mul");
		System.out.println("4Div");
		System.out.println("Enter 1st Number");
		int a= sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b= sc.nextInt();
		System.out.println("Enter Your Choice");
		int c=sc.nextInt();
		switch(c) 
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("invalid choice");


		}
	}

}
