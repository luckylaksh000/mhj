package javaexamples;

public class OverRide1 {
	public void add(int a, int b) {
		System.out.println(a-b);
		System.out.println("New Feature");
	}

	public static void main(String[] args) {
		OverRide1 obj = new OverRide1();
		obj.add(30,10 );
		

	}

}
