package chap08.book.Exercise.p03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.Sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
