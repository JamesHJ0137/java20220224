package chap06.book.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //constructor
		
		myCar.setGas(5); //method
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해주세요.");
		}
	}
}
