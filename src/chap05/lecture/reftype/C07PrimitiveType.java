package chap05.lecture.reftype;

public class C07PrimitiveType {
	public static void main(String[] args) {
		int i1 = 3;
		method1(i1);
		System.out.println(i1);
	}
	//기본 타입은 인스턴스가 따로 존재하지 않기 때문에 변하지 않음
	public static void method1(int i) {
		i = 300;
	}
}
