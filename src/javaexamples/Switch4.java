package javaexamples;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("enter the value");
String course=sc.next();
switch(course.toUpperCase()) {
case "QTP":
	System.out.println("course is Available::"+course);
	break;
case "SELENIUM":
	System.out.println("course is Available::"+course);
	break;
case "JAVA":
	System.out.println("course is Available::"+course);
	break;
case "DataScience":
	System.out.println("course is Available::"+course);
	break;
default:
	System.out.println("course is not Available::"+course);
	break;


}

}
	}

}
