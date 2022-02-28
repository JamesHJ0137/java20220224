package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		System.out.println("명령문 1");
		myMethod1(300);
		System.out.println("명령문 2");
		
		myMethod1(3);
		System.out.println("명령문 3");
	}
	
	// method명: lowerCamelCase
	
	
	// ()에 파라미터 타입과 파라미터명 작성 가능
	public static void myMethod1(int i) {
		System.out.println("마이메소드 1");
		System.out.println("파라미터 i의 값 : " + i);
	}
}
