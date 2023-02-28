package javaexamples;

public class Data_variable1 {
	int b=30;//instance variable
	static int empid = 100;//static variable
	public void m1() {
		int a=10;//local variable
		System.out.println("m1 executed");
		System.out.println(a  +"local variable");
	}
	public void m2() {
		System.out.println("m2 executed");
		System.out.println(b+"instance variable");
	}
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(empid+"static variable");
		System.out.println(b);
	}
	public static void st() {
		System.out.println("m3 executed");
		System.out.println(empid+"static variable");

		System.out.println("static method executed");
	}



	public static void main(String[] args) {
		System.out.println("main method executed");
		Data_variable1 m =new  Data_variable1();
		m.m1();
		m.m2();
		m.m3();
		Data_variable1.st();
	}

}
