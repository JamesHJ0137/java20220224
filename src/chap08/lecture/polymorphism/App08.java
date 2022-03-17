package chap08.lecture.polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App08 {
	public static void main(String[] args) {
		// instanceof
		
		Animal animal1 = new Retriever();
		
		System.out.println(animal1 instanceof Retriever); //true
		System.out.println(animal1 instanceof Animal); // true
		System.out.println(animal1 instanceof Canine); // true
		System.out.println(animal1 instanceof Pet); // true
		System.out.println(animal1 instanceof Helper); // true
		// true일때만 강제 형변환 사용하기
		
		if (animal1 instanceof Helper) {
		Helper helper = (Helper) animal1;
		helper.help();
		}
	}
}
