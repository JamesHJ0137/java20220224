package chap13.book.Exercise.s130400;

import chap13.book.Exercise.s130200.Box1;

public class Util {
	public static <T> Box1<T> boxing(T t) {
		Box1<T> box = new Box1<T>();
		box.set(t);
		return box;
	}

	
}
