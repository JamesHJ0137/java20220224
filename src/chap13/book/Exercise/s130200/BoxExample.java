package chap13.book.Exercise.s130200;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");					// String -> Object auto
		String name = (String) box.get();	// Object -> String enforce
		
		box.set(new Apple());				// Apple -> Object auto
		Apple apple = (Apple) box.get();	// Object -> Apple enforce
	}
}
