package javaexamples;

public class Overloadexample {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
     Overloadexample  add  =new Overloadexample();
     add.add(5, 3, 2);
	}

}
