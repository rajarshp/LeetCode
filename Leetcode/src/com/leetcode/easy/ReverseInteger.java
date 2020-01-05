package com.leetcode.easy;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.

		Example 1:
		
		Input: 123
		Output: 321
		Example 2:
		
		Input: -123
		Output: -321
		Example 3:
		
		Input: 120
		Output: 21
 */

public class ReverseInteger {

	public int reverse(int x) {
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}

		if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) res;
	}

}
