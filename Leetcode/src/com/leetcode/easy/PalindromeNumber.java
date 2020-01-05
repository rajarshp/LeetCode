package com.leetcode.easy;

/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

	Example 1:
	
	Input: 121
	Output: true
	Example 2:
	
	Input: -121
	Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
	Example 3:
	
	Input: 10
	Output: false
	
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber {
	public boolean isPalindrome(int x) {

//      String s = new StringBuilder(String.valueOf(x)).toString();
//      String rev = new StringBuilder(s).reverse().toString();

//      if(s.equals(rev)){
//          return true;
//      }

//      return false;

		int rev = 0;
		int num = x;

		if (num < 0) {
			return false;
		}

		while (x != 0) {
			int digit = x % 10;
			rev = rev * 10 + digit;
			x /= 10;
		}

		// System.out.println(rev);

		if (num == rev) {
			return true;
		}
		return false;

	}

}
