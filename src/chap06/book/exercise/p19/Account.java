package chap06.book.exercise.p19;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 10000000;
	private int balance;
	
	public int getBalance () {
		return balance;
	}
	
	public void setBalance (int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
		this.balance = balance;
		}
	}
}