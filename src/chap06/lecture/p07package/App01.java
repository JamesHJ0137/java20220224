package chap06.lecture.p07package;

public class App01 {
	public static void main(String[] args) {
		// 클래스 정의할 때 패키지를 같이 정의해야함
		// 파일 상위 package 키워드와 같이 작성. 예)package chap06.lecture.p07package;
		// 실제 파일이 있는 위치와 일치하게 작성
		// 작성 규칙: 기본적으로 소문자로 작성 (회사 케바케)
		
		// 클래스 이름이 같아도 패키지가 다르면 다른 클래스임 예) App01
		// 
		// 클래스의 full name은 패키지가 앞에 붙음
		chap06.lecture.p03constructor.Computer com1;
		chap06.lecture.p04method.Computer com2;
		
		// import 키워드로 클래스 full name 패키지 생략 가능
		
	}
}
