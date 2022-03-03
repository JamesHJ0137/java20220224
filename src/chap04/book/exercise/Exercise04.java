package chap04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int sum = 0;
		boolean more = true;

		while (more) {
			int num1 = (int) (Math.random() * 6) + 1;

			int num2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + num1 + ")" + "," + "(" + num2 + ")");
			sum = num1 + num2;

			if (sum == 5) {
				more = false;

				System.out.println("주사위 합이 " + sum + "이므로 종료합니다.");
//				System.exit(0);
			}
		}
	}
}
