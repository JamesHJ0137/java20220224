package chap07.book.s070703;

import chap07.book.s070702.*;

public class Car {

	//field
	Tire[] tires = {
			new Tire ("앞왼쪽", 6),
			new Tire ("앞오른쪽", 2),
			new Tire ("뒤왼쪽", 3),
			new Tire ("뒤오른쪽", 4)
	};

	//method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll()==false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차를 멈춥니다.]");
	}
}
