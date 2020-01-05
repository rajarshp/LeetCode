package com.leetcode.easy;

/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

		Example 1:
		
		Input: [3,0,1]
		Output: 2
		Example 2:
		
		Input: [9,6,4,2,3,5,7,0,1]
		Output: 8
	Note:
	Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

public class MissingNumber {
	public int missingNumber(int[] nums) {

		// O(nlogn)

		// Arrays.sort(nums);
		// int i=0;
		// for(i=0;i<nums.length;i++){
		// if(nums[i] != i){
		// return i;
		// }
		// }
		// return i;

		// TreeSet<Integer> set = new TreeSet();
		// for(int i=0;i<nums.length;i++){
		// set.add(nums[i]);
		// }
		// int j;
		// for(j=0;j<set.size();j++){
		// if(!set.contains(j)){
		// return j;
		// }
		// }
		// return -1;

		// O(n)

		int missing = nums.length;
		for (int i = 0; i < nums.length; i++) {
			missing += i;
			missing -= nums[i];
		}
		return missing;

	}

}
