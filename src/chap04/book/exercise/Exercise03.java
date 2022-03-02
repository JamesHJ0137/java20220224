package chap04.book.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		// 1~100까지의 정수 중에서 3의 배수 총합
		
		int sum = 0;
		
		// for (int i = 0; i <= 100; i += 3) {
		// sum += i;
		// }
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
			sum += i;
			}
		}
		
		System.out.println("1~100 3의 배수의 합 : " + sum);
	}
}
