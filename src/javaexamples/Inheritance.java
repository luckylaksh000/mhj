package javaexamples;
class A2 {
	int a= 10;
	int b = 20;
	public void m1() {
		System.out.println("m1 Executed");
	}
}
class B2 extends A2 {
	int x= 5;
	int y=6;
	public void m2() {
		System.out.println("m2 Executed");
	}
}

public class Inheritance extends B2 {
	public void m3() {
		System.out.println("m3 Executed");
		System.out.println(a+b);
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {
		Inheritance  obj  = new Inheritance();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
