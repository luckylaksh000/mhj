package javaexamples;
public class Hello1 {
public void m1() {
System.out.println("m1Executed");
}
public void m2() {
System.out.println("m2 Executed");		
}
public void m3() {
System.out.println("m3 Executed");	
}
public static void main(String args[]) {
System.out.println("Main method executed");
//class name object name= new class name();
 Hello1   m=  new Hello1();
 m.m1();
 m.m2();
 m.m3();
}
}