package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		// sum & mean
		
		int sum = list.get(0);
		int mean = list.get(0);
		
		int n = list.size();
		
		for(int i=1; i<n; i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		System.out.println(sum / (double) list.size());
	}
}
