package javaexamples;

 class A1 {
	
	int a=10;
	int b=20;
	public void m1() {
		
		System.out.println("m1 executed");
	}
}
class B1 extends A1{
	

	int x= 40;
	int y=50;
	public void m2() {
		
		System.out.println("m2 executed");
		System.out.println(a+b);
	}
	}
public class Multiple_Inheritance extends B1{
	
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(a+b);
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Multiple_Inheritance obj = new Multiple_Inheritance();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	}