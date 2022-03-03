package chap04.book.exercise;

import java.util.Scanner;

public class Exercise07Answer {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		/*loop*/while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			}

//			int n = scanner.nextInt();
//			
//			switch (n) {
//			case 1:
//				System.out.println("예금액> ");
//				balance += scanner.nextInt();
//				break;
//			case 2:
//				System.out.println("출금액> ");
//				balance -= scanner.nextInt();
//				break;
//			case 3:
//				System.out.println("잔고> "+ balance);
//				break;
//			case 4:
//				break loop;
//			}
//			
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
}
