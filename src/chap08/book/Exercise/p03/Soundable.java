package chap08.book.Exercise.p03;

public interface Soundable {
	String Sound(); //public abstract 생략
	
	static void Cat() {
		System.out.println("야옹");
	}
	
	static void Dog() {
		System.out.println("멍멍");
	}
}
