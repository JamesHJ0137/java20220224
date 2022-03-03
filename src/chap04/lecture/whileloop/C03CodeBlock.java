package chap04.lecture.whileloop;

public class C03CodeBlock {
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("hello");
		}
		
		// 괄호 안이 하나일 때 {}를 생략해도 무방하나 하지 말 것
		// 들여쓰기와 괄호가 없으면 혼돈을 빚음
		if (true) System.out.println("hello");
				   System.out.println("java");
				   
		for (int i = 0; i < 3; i++)
			System.out.println(i);
	}
}
