package chap04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		String star = "*";
		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";
		}
		
		// 끝에 Enter 없이 출력하는 것이 print
		
		System.out.print("출력1");
		System.out.print("출력2");
		System.out.println(); // 그냥 다음 줄
		System.out.print("출력3");
		System.out.println("출력4");
		System.out.println("출력5");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
