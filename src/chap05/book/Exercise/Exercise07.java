package chap05.book.Exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0; // 음수라면 원하는대로 나오지 않음 integer 최저값으로 놓거나 max를 array[0]값을 기본값으로 시작해도 됨
		int[] array = { 1, 5, 3, 8, 2 };

		//작성 위치
		//		for (int i = 0; i < array.length; i++) {
		//			if (array[i] > max) {
		//				max = array[i];
		//			}
		//		}
		for (int item : array) {
			if (item > max) {
				max = item;
			}
		}

		System.out.println("max: " + max);
	}
}
