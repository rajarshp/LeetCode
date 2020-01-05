package com.leetcode.easy;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	An input string is valid if:

	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid.

	Example 1:
	
	Input: "()"
	Output: true
	Example 2:
	
	Input: "()[]{}"
	Output: true
	Example 3:
	
	Input: "(]"
	Output: false
	Example 4:
	
	Input: "([)]"
	Output: false
	Example 5:
	
	Input: "{[]}"
	Output: true
 */

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() == 1) {
			return false;
		}
		Stack<Character> st = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else if (c == ')' && !st.isEmpty()) {
				if (st.pop() != '(') {
					return false;
				}
			} else if (c == '}' && !st.isEmpty()) {
				if (st.pop() != '{') {
					return false;
				}
			} else if (c == ']' && !st.isEmpty()) {
				if (st.pop() != '[') {
					return false;
				}
			} else {
				st.push(c);
			}
		}

		return st.isEmpty();

	}

}
