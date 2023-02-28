package javaexamples;

public class Hello2 {
	public void m1() {
		System.out.println("m1 Executed");
	}
	public void m2() {
		System.out.println("m2 Executed");
	}
	public void m3() {
		System.out.println("m3 Executed");
	}


	public static void main(String[] args) {
System.out.println("Main Method Executed");
//classname object name = new class name
   Hello2  m = new Hello2();
   m.m1();
   m.m2();
   m.m3();
	}

}
