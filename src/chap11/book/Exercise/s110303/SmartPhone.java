package chap11.book.Exercise.s110303;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String compnay, String os) {
		this.company = compnay;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + ", " + os;
	}
	
	
}
