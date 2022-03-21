package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = null;

		try {
			int r = arr1[0] / arr1[1];

			System.out.println(r);
		} catch (Throwable e) {
			System.out.println("아리스메틱익셉션 발생");
		}
		// 하는 일이 같다면 상위타입 써도 무방
		// 공통된 상위 타입과 하위 타입의 모든 익센셥을 잡으려할 때 사용

		System.out.println("프로그램 실행 계속");
	}
}

