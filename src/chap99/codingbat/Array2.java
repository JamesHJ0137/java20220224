package chap99.codingbat;

public class Array2 {
	public boolean has22(int[] nums) {

		int i = 0;

		while (i < nums.length - 1) {
			if (nums[i] == 2) {
				int next = nums[i + 1];
				if (next == 2) {
					return true;
				}
			}

			i++;
		}

		return false;
	}
	// Array-2 lucky13
	public boolean lucky13(int[] nums) {
		  boolean has1 = false;
		  boolean has3 = false;
		  
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] ==1) {
		      has1 = true;
		    }
		    if (nums[i] == 3) {
		      has3 = true;
		    }
		  }
		  return !has1 && !has3;
		}

}
