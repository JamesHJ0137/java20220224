package chap06.lecture.p11annotation;

public class App07 {
	@MyAnnotation7(value = "java", price = 300)
	void method() {
		
	}
	@MyAnnotation7(price = 200, value = "spring")
	void method2() {}
	
	// 여러개 값을 넣을 때 중괄호{} 사용하여 넣으면 된다
	@MyAnnotation7(value = {"spring", "java"}, price = 500)
	void method3() {}
	
	@MyAnnotation7
	void method4() {}
}
