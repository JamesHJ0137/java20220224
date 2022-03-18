package chap09.lecture.p01nested;

public class MyClass6 {
	int outField1;
	void outMethod1() {
		
	}
	
	void method1() {
		class LocalClass {
			int outField1;
			
			void method1() {
				// 안쪽 클래스에서 바깥쪽 클래스 접근 방법
				// this 사용하여 안 밖을 구분할 것
				outField1 = 3;
				this.outField1 = 4;
				MyClass6.this.outField1 = 3;
				outMethod1();
				this.outMethod1();
				MyClass6.this.outMethod1();
			}
		}
	}
}
