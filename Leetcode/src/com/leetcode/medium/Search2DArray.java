package com.leetcode.medium;

/*
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
		
		Example 1:
		
		Input:
		matrix = [
		  [1,   3,  5,  7],
		  [10, 11, 16, 20],
		  [23, 30, 34, 50]
		]
		target = 3
		Output: true
 */

public class Search2DArray {

	public static void main(String[] args) {

		System.out.println(searchMatrix(new int[][] { { 1 }, { 2, 3 }, { 4 } }, 4));
	}

	public static boolean searchMatrix(int[][] m, int target) {

		int rows = m.length;
		if (m == null || rows == 0) {
			return false;
		}

		for (int i = 0; i < m.length; i++) {
			int lstCol = m[i].length - 1;
			if (m[i].length > 0) {
				if (m[i][0] == target) {
					return true;
				} else if (m[i][lstCol] >= target) {
					return binarySearch(m[i], 0, lstCol, target);
				}
//				else {
//					return false;
//				}
			}
		}
		return false;
	}

	public static boolean binarySearch(int[] a, int s, int e, int t) {

		if (e >= s) {
			int m = s + (e - s) / 2;

			if (a[m] == t) {
				return true;
			} else if (a[m] > t) {
				return binarySearch(a, s, m - 1, t);
			} else {
				return binarySearch(a, m + 1, e, t);
			}
		}
		return false;
	}

}
