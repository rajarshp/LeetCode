package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:

			Given nums = [2, 7, 11, 15], target = 9,

			Because nums[0] + nums[1] = 2 + 7 = 9,
			return [0, 1].
 */

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			int y = target - x;

			if (map.get(y) != null) {
				res[0] = map.get(y);
				res[1] = i;
			}

			map.put(x, i);
		}
		return res;
	}

}
