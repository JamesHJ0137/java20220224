package chap04.lecture.switchcase;

public class C01Switch {
	public static void main(String[] args) {
		
		// 일치하는 곳부터 실행됨
		System.out.println("stmt 1");
		switch (3) {
		case 1:
			System.out.println("stmt 2");
		case 2:
			System.out.println("stmt 3");
		case 3:
			System.out.println("stmt 4");
		}
		System.out.println("stmt 5");
	}
}
