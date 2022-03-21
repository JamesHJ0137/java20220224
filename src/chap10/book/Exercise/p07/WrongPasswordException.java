package chap10.book.Exercise.p07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
