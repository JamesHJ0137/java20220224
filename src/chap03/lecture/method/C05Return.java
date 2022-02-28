package chap03.lecture.method;

public class C05Return {
	public static void main(String[] args) {
		System.out.println("명령문1");
		System.out.println("명령문2");
		int i = myMethod2();
		System.out.println("명령문3");
		System.out.println(i);

	}
	public static void myMethod1() {
		System.out.println("my method1 명령문1");
		System.out.println("my method1 명령문2");

		//return : 1. 메소드 종료, 2. 오른쪽에 있는 값을 호출한 곳으로 반환 (return)
		
		return;
		
//		System.out.println("my method1 명령문3");
		// return 이후 실행 되지 않음
	}
	
public static int myMethod2() {
	// method명 앞에 return 하는 값의 타입 명시해야함
	// 만약 return 하는 값이 없으면 void로 명시
	
	System.out.println("my method2 명령문1");
	
	return 3;
}
}
