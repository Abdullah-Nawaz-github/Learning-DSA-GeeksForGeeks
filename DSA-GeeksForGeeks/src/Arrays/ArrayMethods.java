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

//	Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the right by d positions.
	public static int[] rightRotate(int[] arr, int d) {

		// creating result array
		int[] result = new int[arr.length];

		// keeping track of index of result array
		int k = 0;

		// adding elements from the back of arr to front of result array
		for (int i = arr.length - d; i < result.length; i++) {
			result[k++] = arr[i];
		}

		// adding elements from the front of arr to back of result array
		for (int i = 0; i < arr.length - d; i++) {
			result[k++] = arr[i];
		}
		return result;
	}

	// search, insert, and delete operations in an unsorted array

	public static int search(int[] arr, int n, int key) {

		// linear traversal through the array
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		// if key is not found
		return -1;
	}

	public static int insertAtEnd(int arr[], int n, int key, int capacity) {
		if (n >= capacity)
			return n;

		arr[n] = key;

		return (n + 1);
	}

	public static int[] insertElement(int arr[], int n, int element, int pos) {
		int[] temp = new int[n + 1];
		int count = 0;
		for (int i = 0; i < pos; i++) {
			temp[count++] = arr[i];
		}
		for (int i = pos + 1; i < temp.length; i++) {
			temp[i] = arr[i - 1];
		}
		temp[pos] = element;
		return temp;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 }; // 5
		System.out.println(Arrays.toString(ArrayMethods.insertElement(arr1, arr1.length, 99, 3)));
	}

}
