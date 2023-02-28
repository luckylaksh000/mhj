package javaexamples;

 class O {
	int a=10;
	int b=20;
	public void m1() {
		System.out.println("m1 Executed");
	}
}
 class P extends O{
	int x = 30;
	int y =40;
	public void m2() {
		System.out.println("m2 Executed");
		System.out.println(a+b);
		
	}
}
public class Q extends P{
	public void m3() {
		System.out.println("m3 Executed");
		System.out.println(a+b);
		System.out.println(x+y);
	}
	public static void main(String []args) {
		Q sc = new Q();
		sc.m1();
		sc.m2();
		sc.m3();
	}
}
