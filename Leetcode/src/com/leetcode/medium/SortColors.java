package com.leetcode.medium;

/*
 * Given an array with n objects colored red, white or blue, sort them in-place so that 
 * objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, 
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this problem.

		Example:
		
		Input: [2,0,2,1,1,0]
		Output: [0,0,1,1,2,2]
 */

public class SortColors {

	static int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };

	public static void main(String[] args) {
		sortColors(nums);
		System.out.println(nums);

	}

	public static void sortColors(int[] nums) {
		int[] c = new int[3];

		for (int a : nums) {
			c[a] += 1;
		}
		int p = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < c[i]; j++) {
				nums[p] = i;
				p++;
			}

		}
	}

}
