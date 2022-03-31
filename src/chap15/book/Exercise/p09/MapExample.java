package chap15.book.Exercise.p09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// 모두 탐색
		// entrySet 사용
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}

		// keySet
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}

		// forEach
		// 지역 변경 X
		map.forEach((k, v) -> System.out.println(k + "=" + v));

		// 확인 문제 9

		keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);

			if (value > maxScore) {
				name = key;
				maxScore = value;
			}
			totalScore += value;
		}
		System.out.println("평균 점수: " + (totalScore / map.size()));
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 아이디" + name);

	}
}
