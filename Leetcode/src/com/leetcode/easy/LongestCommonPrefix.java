package com.leetcode.easy;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

	If there is no common prefix, return an empty string "".

	Example 1:
	
	Input: ["flower","flow","flight"]
	Output: "fl"
	Example 2:
	
	Input: ["dog","racecar","car"]
	Output: ""
	
	Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length <= 0) {
			return "";
		}
		// List<String> list = Arrays.asList(strs);
		// list.sort((s1,s2) -> s1.length() - s2.length());

		// String s = strs[0];//list.get(0);
		StringBuilder sb = new StringBuilder();

		for (char c : strs[0].toCharArray()) {
			sb.append(c);
			for (String ss : strs) {
				if (!ss.startsWith(sb.toString())) {
					sb.deleteCharAt(sb.length() - 1);
					return sb.toString();
				}
			}

		}
		return sb.toString();
	}

}
