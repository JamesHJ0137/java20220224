package chap04.book;

public class IfNestedExample2 {
	public static void main(String[] args) {
		int score = (int) (Math.random()*100)+1;
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 40) {
			grade = "pass";
		} else {
			grade = "failed";
		}
		System.out.println("학점: " + grade);
	}
}
