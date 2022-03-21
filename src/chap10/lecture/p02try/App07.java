package chap10.lecture.p02try;

public class App07 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 0};

		try {
			int r = arr1[0] / arr1[1];

			System.out.println(r);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("아리스메틱익셉션 또는 널포인터익셉션 발생");
		}
		// 여러 타입의 익셉션을 한 번에 쓰고 싶을 때 ()안에 |를 사용

		System.out.println("프로그램 실행 계속");
	}
}