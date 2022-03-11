package chap06.lecture.p04method;

public class Computer {
	// methodName (파라미터목록)
	void execute(String programme) {
		System.out.println(programme);
	}
	
	void update(String app) {
		System.out.println(app + "을 업데이트합니다.");
	}
	
	void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("합 : " + sum);
	}
}
