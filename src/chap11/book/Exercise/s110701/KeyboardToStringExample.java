package chap11.book.Exercise.s110701;

public class KeyboardToStringExample {
	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}
