package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.*;

public class App07 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		chihuahua.cry();
		chihuahua.angry();
		
		Animal animal = chihuahua; // 자동 형 변환
		animal.breathe();
		animal.cry();
//		animal.angry();
	}
}
