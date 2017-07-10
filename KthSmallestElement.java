package com.cp.ib.precp;

import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 3, 2};
		System.out.println(kthsmallest(arr, 3));
	}
	
	public static int kthsmallest(int[] A, int B) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i=0; i<A.length; i++) {
			pq.offer(A[i]);
		}
		int n = -1;
		while (B > 0) {
			n = pq.poll();
			B--;
		}
		return n;
	}
}
