package javaexamples;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
int a,b,c;
System.out.println("Enter the values of a &b");
Scanner sc = new Scanner(System.in);
a= sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("Addition of 2 numbers"+c);
	}

}
