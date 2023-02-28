package javaexamples;
import java.util.Scanner;


public class Switch1 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("1 Add");
		System.out.println("2 sub");
		System.out.println("3 mul");
		System.out.println("4div");
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter your Choice");
		int ch  =  sc.nextInt();
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
		default:
			System.out.println("Invalid Choice");

		}

	}

}
