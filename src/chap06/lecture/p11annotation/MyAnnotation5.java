package chap06.lecture.p11annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
// static으로 생략 가능

@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnnotation5 {
	// 타입과 이름을 명시해주면 된다
	String name(); // (name) element or attribute
}
