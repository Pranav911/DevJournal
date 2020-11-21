package com.codinjans.practice;

public class ArrayReverse {
	
	public void reverse(int[] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0, j = n - 1; i < n / 2 && j >= n / 2; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public void reverseRecursive(int[] arr) {
		reverseRecursiveUtility(arr, 0, arr.length-1);
	}

	private void reverseRecursiveUtility(int[] arr, int i, int j) {
		if (i < j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			reverseRecursiveUtility(arr, ++i, --j);
		}
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayReverse arrayReverse = new ArrayReverse();
		
		// Odd number of elements
		System.out.println("Test for odd number of elements:-");
		int inputOdd[] = { 1, 2, 3, 4, 5 };
		arrayReverse.print(inputOdd);
		arrayReverse.reverse(inputOdd);
		arrayReverse.print(inputOdd);
		arrayReverse.reverseRecursive(inputOdd);
		arrayReverse.print(inputOdd);
		
		// Even number of elements
		System.out.println("\nTest for even number of elements:-");
		int inputEven[] = { 1, 2, 3, 4, 5, 6 };
		arrayReverse.print(inputEven);
		arrayReverse.reverse(inputEven);
		arrayReverse.print(inputEven);
		arrayReverse.reverseRecursive(inputEven);
		arrayReverse.print(inputEven);
	}

}
