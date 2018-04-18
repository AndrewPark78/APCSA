package unit13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class BinaryVsLinear {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < 100; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.println(i);
		}
		BinaryVsLinear bvl = new BinaryVsLinear();
//		int n = nums.length;
//		int x = 10;
//		int result = bvl.binSearch(nums, 0, n - 1, x);
//		if (result == -1)
//			System.out.println("Element not present");
//		else
//			System.out.println("Element found at index " + result);
//		
		long millisStart = Calendar.getInstance().getTimeInMillis();
		System.out.println("searched " + bvl.linSch(nums, 10));
		long millisStart1 = Calendar.getInstance().getTimeInMillis();
		long elapsed = millisStart1-millisStart;
		System.out.println("Time: " + elapsed);
	}

	public int binSearch(int arr[], int l, int x, int r) {
		int count = 0;
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x) {
				count++;
			}

			if (arr[mid] > x) {
				return binSearch(arr, l, mid - 1, x);
			}
			return binSearch(arr, mid + 1, r, x);
		}

		return count;
	}

	public int linSch(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == target){
				count ++;
			}
		}
		return count;
	}
}
