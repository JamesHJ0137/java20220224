package chap07.book.s070702;

public class Tire {
	//field
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어의 위치
	
	//constructor
	public Tire(String location, int maxRotation) {
		this.location = location;	//타이어의 위치 초기화
		this.maxRotation = maxRotation; //최대 회전수(타이어 수명) 초기화
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation; 		//누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
