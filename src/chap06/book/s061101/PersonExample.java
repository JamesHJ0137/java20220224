package chap06.book.s061101;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "6454321-7654321";
		//p1.name = "을지문덕";
		// final 때문에 값을 바꿀 수 없음
	}
}
