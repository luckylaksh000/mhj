package javaexamples;

import java.util.Scanner;

public class Switch12 {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("1 Add");
System.out.println("2 Sub ");
System.out.println("3 Mul");
System.out.println("4 div");
System.out.println("Enter the 1st number");
int a= obj.nextInt();
System.out.println("Enter the 2nd number");
int b = obj.nextInt();
System.out.println("Enter your choice");
int ch= obj.nextInt();
switch(ch) {
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
	default :
		System.out.println("invalid choice");
}

	}

}
