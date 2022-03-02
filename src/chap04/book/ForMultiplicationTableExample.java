package chap04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "X" + n + "=" + (m*n));
			}
		}
		
		// 9단 ~ 2단
		for (int o = 9; o >= 2; o--) {
			System.out.println("***" + o + "단***");
			for (int p = 1; p <= 9; p++) {
				System.out.println(o + "X" + p + "=" + (o*p));
			}
		}
		// 9*9=81 ~ 2*1=2
		
		for (int q = 9; q >= 2; q--) {
			System.out.println("***" + q + "단***");
			for (int r = 9; r >= 1; r--) {
				System.out.println(q + "X" + r + "=" + (q*r));
			}
		}
	}
}
