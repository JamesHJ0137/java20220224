package chap13.book.Exercise.p04;

public class Util {
	public static <T extends Pair<String, Integer>> Integer getValue(Pair<String, Integer> pair, String string) {
		String key = pair.getKey();
		
		if(key.equals(string)) {
			return pair.getValue();
		}
		return null;
	}
}
