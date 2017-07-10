package com.cp.ib.precp;

import java.util.ArrayList;

/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
public class ConcentricRectPattern {

	public static void main(String[] args) {
		ConcentricRectPattern pattern = new ConcentricRectPattern();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		result = pattern.prettyPrint(3);
		System.out.println(result);
	}
		
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
    	
		int size = 2 * A - 1;
		int[][] pattern = new int[size][size];
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();


		for (int i = 0; i < A; ++i) {
			for (int j = 0; j < A; ++j) {
				if (j <= i) {
					pattern[i][j] = A - j;
				}
				else {
					pattern[i][j] = A - i;
				}
				
			}
		}

		for (int i = 0; i < A; ++i) {
			for (int j = size - 1; j >= A; --j) {
				pattern[i][j] = pattern[i][size - 1 - j];
			}
		}

		for (int i = size - 1; i >= A; --i) {
			for (int j = 0; j < size; ++j) {
				pattern[i][j] = pattern[size - 1 - i][j];
			}
		}

		for (int i = 0; i < size; ++i) {
			ArrayList<Integer> innerList = new ArrayList<>();
			for (int j = 0; j < 2 * A - 1; ++j) {			
				innerList.add(pattern[i][j]);
			}		
			resultList.add(innerList);
		}
		return resultList;
	}

}