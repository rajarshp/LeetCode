package com.leetcode.easy;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has 
 * the largest sum and return its sum.

		Example:
		
		Input: [-2,1,-3,4,-1,2,1,-5,4],
		Output: 6
		Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using 
the divide and conquer approach, which is more subtle.
 
 */

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {

		// O(n^2) approach
		// int res = Integer.MIN_VALUE;

		// for(int i=0;i<nums.length;i++){
		// int sum = 0;
		// for(int j = i;j<nums.length;j++){
		// sum += nums[j];
		// if(sum > res){
		// res = sum;
		// }
		// }
		// }
		// return res;

		// Using DP

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int sum = nums[0];
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			max = Math.max(sum, max);
		}

		return max;
	}

}
