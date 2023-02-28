package javaexamples;

public class Overload1 {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
Overload1  obj =new Overload1();
obj.add(10, 20);
obj.add(5, 2, 3);

	}

}
