package question11;

import java.util.Arrays;

public class SmallestFinderApp {

	public static void main(String[] args) {
		int[] arr0 = null;
		var arr1 = new int[] {};
		var arr2 = new int[]{8, 94, -5, 19, 2, 10};

		var result0 = findSmallestRecursively(arr0); // Expected result: should throw IllegalArgumentException
		var result1 = findSmallestRecursively(arr1); // Expected result: should throw IllegalArgumentException
		var result2 = findSmallestRecursively(arr2); // Expected result: -5
		
		var result01 = findSmallestIteratively(arr0); // Expected result: should throw IllegalArgumentException
		var result11 = findSmallestIteratively(arr1); // Expected result: should throw IllegalArgumentException
		var result21 = findSmallestIteratively(arr2); // Expected result: -5
		
		System.out.println("////=== WITH RECURSION ====////");
		System.out.printf("The smallest in array, %s, is: %d\n", 
				Arrays.toString(arr2), result2);

	}

	/**
	 * Uses Recursion technique to find the smallest integer from
	 * the given array of integers
	 * @param arr the given array of integers
	 * @return the smallest value, if present
	 */
	private static int findSmallestRecursively(int[] arr) {
		if(arr == null || arr.length < 1) {
			throw new IllegalArgumentException();
		}
		if(arr.length == 1) {
			return arr[0];
		}
		int min = arr[0];
		int[] newArray = new int[arr.length -1];
		System.arraycopy(arr, 1, newArray, 0, arr.length-1);
		
		int newMin = findSmallestRecursively(newArray);
		
		return  newMin > min ? min : newMin;
	}
	
	/**
	 * Uses Iteration technique to find the smallest integer from
	 * the given array of integers
	 * @param arr the given array of integers
	 * @return the smallest value, if present
	 */
	private static int findSmallestIteratively(int[] arr) {
		if(arr == null || arr.length < 1) {
			throw new IllegalArgumentException();
		}
		
		int min = arr[0];
		for(int i=1; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}