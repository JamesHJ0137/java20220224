package chap07.lecture.p07abstract;

public class App01 {
	public static void main(String[] args) {
//		Canine c1 = new Canine(); // 추상클래스로 인스턴스 만들 수 없음
		Canine c2 = new Chihuahua();
		Canine c3 = new Jindo();

		c2.play();
		c3.play();

		method(c2);
		method(c3);
	}

	public static void method(Canine dog) {
		dog.play();
	}
}
