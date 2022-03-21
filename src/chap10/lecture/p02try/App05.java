package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {
		int[] arr1 = null;

		try {
			int r = arr1[0] / arr1[1];

			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println("아리스메틱익셉션 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오브바운즈익센션 발생");
		} catch (RuntimeException e) {
			System.out.println("널포인터익센션 발생");
		}
		// catch 블럭 여러개 작성시
		// 상위 타입 작성에 주의할 것
		// 하위 타입 보다 상위 타입 익셉션을 작성하려면 아래에 적을 것

		System.out.println("프로그램 실행 계속");
	}
}