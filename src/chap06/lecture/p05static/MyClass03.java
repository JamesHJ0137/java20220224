package chap06.lecture.p05static;

public class MyClass03 {
	
	static {
		field2 = 30;
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += i;
		}
	}
	static int field2;
	int field1;
	
	MyClass03() {
		field1 = 10;
	}
}
