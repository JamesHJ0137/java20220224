package chap09.lecture.p02anonymous;

public class App07 {
	public static void main(String[] args) {
		int var = 7;
		
		MyInterface1 o1 = new MyInterface1() {

			@Override
			public void method1() {
				System.out.println(var);
				
			}
			
		};
//		var1 = 9; 바꾸려하면 컴파일 오류 생김
		o1.method1();
	}
	
}
