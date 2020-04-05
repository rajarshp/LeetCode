package com.leetcode.medium;

/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 * You are given a target value to search. If found in the array return true, otherwise return false.

		Example 1:
		
		Input: nums = [2,5,6,0,0,1,2], target = 0
		Output: true
		Example 2:
		
		Input: nums = [2,5,6,0,0,1,2], target = 3
		Output: false
 * 
 */

public class SearchRotatedArray {

	public static void main(String[] args) {

		System.out.println(search(new int[] { 1, 1, 3, 1 }, 3));

	}

	public static boolean search(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return false;
		}

		int s = 0;
		int e = nums.length - 1;

		while (s <= e) {
			int m = s + (e - s) / 2;

			if (nums[m] == target) {
				return true;
			} else if (nums[s] < nums[m]) {
				if (nums[s] <= target && target < nums[m]) {
					e = m - 1;
				} else {
					s = m + 1;
				}
			} else if (nums[s] > nums[m]) {
				if (nums[m] < target && target <= nums[e]) {
					s = m + 1;
				} else {
					e = m - 1;
				}
			} else {
				s++;
			}
		}

		return false;

	}

}
