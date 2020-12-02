package com.codinjans.practice;

public class ArrayMaxSubArr {

	public void maxSubArr(int[] a) {
		int n = a.length;
		int localMax = a[0];
		int globalMax = a[0];
		
		for(int i=1; i<n; i++) {
			localMax = Math.max(a[i], localMax+a[i]);
			globalMax = Math.max(globalMax, localMax);
		}
		
		System.out.println("Largest Sum Contiguous Subarray: " + globalMax);
	}
	
	public static void main(String[] args) {
		ArrayMaxSubArr arrayMaxSubArr = new ArrayMaxSubArr();
		int  input[] = {2,6,-9,1,4,-1};
		arrayMaxSubArr.maxSubArr(input);
	}
}
