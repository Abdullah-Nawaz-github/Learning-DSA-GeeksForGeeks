package Arrays;

import java.util.Arrays;

public class ArrayMethods {

//	Given an array (or string), the task is to reverse the array/string.
	public static int[] reverse(int[] arr) {
		// Method 1 (For Loop):

//		int[] result = new int[arr.length];
//		int index = 0;
//		for (int i = arr.length - 1; i >= 0; i--) {
//			result[index++] = arr[i];
//		}
//		return result;

		// Method 2 (While Loop):

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

//	Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
	public static int[] leftRotate(int[] arr, int d) {

//		First Try (temp array):

//		int[] result = new int[arr.length];
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int x = i + d;
//			if (x >= arr.length) {
//				x = x - i - d + count;
//				count++;
//			}
//			result[i] = arr[x];
//		}
//		return result;

//		Method 1 (temp array):

		// creating result array
		int[] result = new int[arr.length];
		// keeping track of index of result array
		int k = 0;

		// adding elements starting from d to the front of result array
		for (int i = d; i < result.length; i++) {
			result[k++] = arr[i];
		}

		// adding elements from the front of arr to back of result array
		for (int i = 0; i < d; i++) {
			result[k++] = arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5, 6, 7, 1, 2 };
		System.out.println(Arrays.toString(ArrayMethods.leftRotate(arr1, 2)));
	}

}
