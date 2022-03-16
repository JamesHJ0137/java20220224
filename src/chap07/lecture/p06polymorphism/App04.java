package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.*;

public class App04 {
	public static void main(String[] args) {
		method(new Animal());
		method(new Canine());
		method(new Feline());
		method(new Chihuahua());
		method(new StreetCat());
	}
	
	public static void method(Animal animal) {
		animal.breathe();
		animal.cry();
	}
}
