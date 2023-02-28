package javaexamples;

import java.util.Scanner;

public class Scanner_add {

	public static void main(String[] args) {
int a,b,c;
System.out.println("Enter a & b values");
Scanner obj = new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
c=a+b;
System.out.println("Add 2 no"+c);
	}

}
