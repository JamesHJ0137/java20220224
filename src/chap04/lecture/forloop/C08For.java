package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = { 3, 1, 9, 0, 7 };

		// arr1 모든 값을 더해서 출력

		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];

		}

		System.out.println(sum);

		//		sum += arr1[0];
		//		sum += arr1[1];
		//		sum += arr1[2];
		//		sum += arr1[3];
		//		sum += arr1[4];
		//	

		//arr1 값 중 가장 큰 값 출력

		int max = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			max = (max < arr1[i]) ? arr1[i] : max;
		}
		System.out.println(max);

		//		if (max < arr1[i]) {
		//			max = arr1[i];
		//		}
		//		System.out.println(max);
		//arr1 값 중 가장 작은 값 출력

		//		int min = arr1[0];
		//		for (int i = 1; i < arr1.length; i++) {
		//			min = (min > arr1[i]) ? arr1[i] : min;
		//		}
		//		
		int min = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println(min);
	}
}
