package chap13.book.Exercise.s130400;

import chap13.book.Exercise.s130200.Box1;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box1<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box1<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}
}
