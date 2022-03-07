package chap05.book;

public class ArrayCopyForExample {
	public static void main(String[] args) {
		int[] oldInArray = {1, 2, 3};
		int[] newInArray = new int[5];
		
		for (int i = 0; i < oldInArray.length; i++) {
			newInArray[i] = oldInArray[i];
		}
		for (int i = 0; i < newInArray.length; i++) {
			System.out.println(newInArray[i] + ", ");
		}
	}
}
