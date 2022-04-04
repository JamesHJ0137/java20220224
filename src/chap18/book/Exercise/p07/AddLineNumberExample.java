package chap18.book.Exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요.
		String filePath =
				"src/chap18/book/Exercise/p07/AddLineNumberExample.java";
		// 작성위치
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int lineNumber = 1;
		while((line = br.readLine()) != null) {
			System.out.println(lineNumber + ": " + line);
			lineNumber++;
		}
		br.close();
		fr.close();
	}
}
