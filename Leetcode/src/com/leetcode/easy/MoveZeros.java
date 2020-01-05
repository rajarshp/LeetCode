package com.leetcode.easy;

import java.util.Arrays;

import org.apache.commons.lang3.time.StopWatch;

/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

		Example:
		
		Input: [0,1,0,3,12]
		Output: [1,3,12,0,0]
	Note:

	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 */

public class MoveZeros {
	static int[] nums;
	static StopWatch sw;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sw = new StopWatch();
		nums = new int[] { 0, 1, 2, 0, 12 };

		// O(n)
		sw.start();
		moveZeroes1(nums);
		sw.stop();

		System.out.println(Arrays.toString(nums) + "Time: " + sw);
		sw.reset();

		// O(N^2)

		sw.start();
		moveZeroes2(nums);
		sw.stop();

		System.out.println(Arrays.toString(nums) + "Time: " + sw);
		sw.reset();

	}

	public static void moveZeroes1(int[] nums) {
		// O(n)

		int s = 0;
		int e = 0;
		int n = nums.length;

		/// move non-zero elsemnts

		while (e < n) {
			if (nums[e] != 0) {
				nums[s] = nums[e];
				s++;
			}
			e++;
		}

		// move the zeros
		while (s < n) {
			nums[s] = 0;
			s++;
		}
	}

	public static void moveZeroes2(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != 0) {
						int t = nums[i];
						nums[i] = nums[j];
						nums[j] = t;
						break;
					}

				}
			}

		}

	}

}
