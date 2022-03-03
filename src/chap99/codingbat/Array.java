package chap99.codingbat;

public class Array {

	// Array-1 1
	public boolean firstLast6(int[] nums) {

		return (nums[0] == 6) || (nums[nums.length - 1] == 6);
	}

	// Array-1 2
	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0) {
			return nums[0] == nums[nums.length - 1];
		}
		return false;
	}

	// Array-1 4
	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);

	}

	// Array-1 5
	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	// Array-2 1
	public int countEvens(int[] nums) {

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	// Array-2 2
	public int bigDiff(int[] nums) {

		int max = nums[0];
		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			max = (max < nums[i]) ? nums[i] : max;

			min = (min > nums[i]) ? nums[i] : min;

		}
		return max - min;
	}

	// Array-2 3
	public int centeredAverage(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = (max < nums[i]) ? nums[i] : max;
			min = (min > nums[i]) ? nums[i] : min;
		}

		sum -= max;
		sum -= min;

		return sum / (nums.length - 2);
	}

	// Array-2 4
	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;
		boolean was13 = false;

		for (int i = 0; i < nums.length; i++) {

			is13 = nums[i] == 13;

			if (!was13 && !is13) {
				sum += nums[i];
			}

			was13 = is13;
		}

		return sum;

	}

	// Array-2 sum67 *0303 집가서 해보기*
	public int sum67(int[] nums) {

		int sum = 0;

		int i = 0;

		while (i < nums.length) {

			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				sum += nums[i];
			}
			i++;
		}

		return sum;
	}
}
