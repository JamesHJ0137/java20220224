package chap10.lecture.p01exception;

import chap08.lecture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		//ClassCastException
		
		Animal animal = new Cat();
		
		Chihuahua chihuahua = (Chihuahua) animal; // exception 발생
	}
}
