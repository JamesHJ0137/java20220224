package chap14.lecture.p01lambda;

public class App02 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> {
				System.out.println(a);
				System.out.println(b);
		};
		// lambda expression
		
		MyInterface2 o2 = new MyInterface2() {
			@Override
			public void method1(int x, int y) {
				System.out.println(x);
				System.out.println(y);
			}
			// 생략 가능
		};
	}
}
interface MyInterface2 {
	void method1(int a, int b);
}