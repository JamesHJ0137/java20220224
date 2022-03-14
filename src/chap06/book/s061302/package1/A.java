package chap06.book.s061302.package1;

public class A {

	// field
	A a1 = new A(true);  	//o
	A a2 = new A(1);	 	//o
	A a3 = new A("문자열");	//o
	
	// constructor
	public A(boolean b) {} // public 모두 접근 가능
	A (int b) {}		   // package 내에서 접근 가능
	private A(String s) {} // private 클래스 내에서 접근 가능
}
