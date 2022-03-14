package chap06.book.s061303.package1;

public class A {
	// field
	public int field1;
	int field2;
	private int field3;
	protected int field4;
	
	// constructor
	public A() {
		field1 = 1; //o
		field2 = 1; //o
		field3 = 1; //o
		
		
		method1();  //o
		method2();  //o
		method3();  //o
		
	}
	
	// method
	public void method1() {}
	void method2() {}
	private void method3() {}
}
