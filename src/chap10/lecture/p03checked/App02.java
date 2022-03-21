package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";
		
		int i = Integer.parseInt(s); 
		// NumberFormatException 발생 가능
		// NumberFormatException은 RuntimeException (unchecked exception)
		// 이기에 컴파일러가 검사 안함
		
		try {
		FileReader fr = new FileReader("");
		// FileNotFoundException 발생 가능
		// FileNotFoundException은 RuntimeException을 상속받지 않았음 (checked exception)
		// 이기에 컴파일러가 검사함
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
