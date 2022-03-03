package chap04.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "Example";
		
		System.out.println(str1);
		System.out.println(str1.equals("spring"));
		System.out.println("java");
		
		String sub1 = str1.substring(0, 2);
		System.out.println(sub1);
		
		System.out.println(str1.substring(2, 4));
		System.out.println(str1.substring(2));
		
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2, 4));
		// 첫번째 값은 포함 두번째값은 미포함
	}
}
