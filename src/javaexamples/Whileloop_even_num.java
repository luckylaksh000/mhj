package javaexamples;

public class Whileloop_even_num {

	public static void main(String[] args) throws Throwable {
		//print even numbers from 1 to 20
		int i= 0;
		while(i<=20) {
			Thread.sleep(2000);
			System.out.println(i);
			i+=2;
		}
	}

}
