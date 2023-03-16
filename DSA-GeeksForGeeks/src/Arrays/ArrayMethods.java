package Arrays;

import java.util.Arrays;

public class ArrayMethods {

//	Given an array (or string), the task is to reverse the array/string.
	public static int[] reverse(int[] arr) {
		// Method 1:

//		int[] result = new int[arr.length];
//		int index = 0;
//		for (int i = arr.length - 1; i >= 0; i--) {
//			result[index++] = arr[i];
//		}
//		return result;

		// Method 2:

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(ArrayMethods.reverse(arr1)));
	}

}
