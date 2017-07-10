package com.cp.ib.precp;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[]= {4, 5, 2, 10};
        
        int a[] = nextGreater(arr);
        for (int i : a) {
        	System.out.print(i + " ");
		}

	}

	static int[] nextGreater(int A[]) {
		int size = A.length;
		int[] nextArr = new int[size];
		int next, i, j;
		for (i = 0; i < size; i++) {
			next = -1;
			for (j = i + 1; j < size; j++) {
				if (A[i] < A[j]) {
					next = A[j];
					break;
				}
			}
			nextArr[i] = next;
		}
		return nextArr;
	}
}
