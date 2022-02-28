package chap04.lecture.ifelse;

public class C04Random {
	public static void main(String[] args) {
		//1~10의 임의의 자연수
		System.out.println("1~10 임의의 자연수");
		double n1 = Math.random(); // 0.0 <= n < 1.0
		System.out.println(n1);
		
		System.out.println(n1 * 10);
		
		// integer로 강제 변환하면 정수값으로 떨어짐
		
		double n2 = n1*10;
		System.out.println(n2);
		
		int n3 = (int)n2;
		System.out.println(n3);
		int n4 = n3+1;
		System.out.println(n4);
		
		//주사위
		System.out.println("주사위");
		System.out.println((int) (Math.random()*6)+1);
		
		//lottery 1~45
		System.out.println("로또");
		System.out.println(); //코드 작성
		int num = ((int) (Math.random()*45))+1;
		System.out.println(num);

		
	}
}
