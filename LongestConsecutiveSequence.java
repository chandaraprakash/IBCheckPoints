package com.cp.ib.precp;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[] =  {100, 4, 200, 1, 3, 2};
        
        System.out.println(longestConsecutive(arr));

	}
	
	private static int longestConsecutive(int[] A) {
		int size = A.length;
		HashSet<Integer> set = new HashSet<Integer>();
        int seqLength = 0;
         
        for (int i=0; i<size; ++i)
            set.add(A[i]);
  
        for (int i=0; i<size; ++i) {
            if (!set.contains(A[i]-1)) {
                int j = A[i];
                while (set.contains(j))
                    j++;
 
                if (seqLength < j-A[i])
                	seqLength = j-A[i];
            }
        }
        return seqLength;
    }

}
