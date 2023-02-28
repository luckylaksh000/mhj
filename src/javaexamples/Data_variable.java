package javaexamples;
public class Data_variable {
	int b=30;
static int empid =101;	
public void m1() {
	int a=10;
System.out.println("m1 Executed");
System.out.println(a+"Local variable");
System.out.println(empid+"static");
}
public static void st() {
System.out.println ("static main method Executed");
}
public void m2() {
System.out.println("m2 Executed");
System.out.println(b+"instance");
System.out.println(empid+"static");
}
public void m3() {
System.out.println("m3 Executed");
System.out.println(empid+"static");
}
public static void main(String args[]) {
System.out.println("Main Method Executed");
Data_variable   m =  new Data_variable();
m.m1();
m.m2();
m.m3();
Data_variable.st();
}
}


