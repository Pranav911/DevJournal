package com.codinjans.practice;

import java.util.Arrays;

public class ArrayMaxMin {
	
	public void findMaxMin(int[] a) {
		int n = a.length;
		if(n < 1) {
			System.out.println("Empty Array");
			return;
		}
		int max = a[0], min = a[0];
		for(int i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min);
	}
	
	public void findSecondLargest(int[] a) {
		int n = a.length;
		
		if(n < 2) {
			System.out.println("Insufficient elements in array");
			return;
		}
		int max = a[0], secondMax = a[1];
		for(int i = 1; i < n; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax) {
				secondMax = a[i];
			}
		}
		
		System.out.println("Second largest element: " + secondMax);
	}
	
	public void kMaxMinElement(int[] a, int k) {
		Arrays.sort(a);
		int kmin = a[k-1];
		int kmax = a[a.length - k];
		System.out.println("Kth smallest element, given k=" + k + " is " + kmin);
		System.out.println("Kth largest element, given k=" + k + " is " + kmax);
	}
	
	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String... args) {
		ArrayMaxMin arrayMaxMin = new ArrayMaxMin();
		int input[] = {5, 1, 9, 6, 10, 2, 12, 4, 11, 0};
		arrayMaxMin.findMaxMin(input);
		arrayMaxMin.findSecondLargest(input);
		arrayMaxMin.kMaxMinElement(input, 4);
		System.out.println("\nSorted array for reference:-");
		arrayMaxMin.print(input);
	}
}
