package javaexamples;

public class Overloadex {
	public void add(int a, int b) {
		System.out.println(a+b);
		}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloadex  obj  = new Overloadex();
		obj.add(5, 03, 02);

	}

}
