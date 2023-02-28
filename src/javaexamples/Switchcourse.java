package javaexamples;

import java.util.Scanner;

public class Switchcourse {

	public static void main(String[] args) {
		//store courses into switch stateme
		Scanner sc = new Scanner(System.in);
		for (int i =1;i<=5;i++) {
			System.out.println("Enter the value");
			
			String course= sc.next();
			
			
			

			switch(course.toUpperCase()) {
			case "qtp":
				System.out.println("course is available::"+course);
				break;


			case"java":
				System.out.println("course is available::"+course);
				break;
			case"SELENIUM":
				System.out.println("course is available::"+course);
				break;
			case"Datascience":
				System.out.println("course is available::"+course);
				break;
			default:
				System.out.println("course is not available::"+course);


			}
		}
	}

}
