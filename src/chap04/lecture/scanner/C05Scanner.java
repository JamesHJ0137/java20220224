package chap04.lecture.scanner;
import java.util.Scanner;
public class C05Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째값>");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째값>");
		int num2 = scanner.nextInt();
		
		System.out.println("새문자열>");
		String str = scanner.nextLine();
		// 스캐너가 기본값이 whitespace
		// 빈 문자열에 str값이 들어감
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(str);
		scanner.close();
	}
}
