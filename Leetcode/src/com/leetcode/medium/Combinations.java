package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
		
		Example:
		
		Input: n = 4, k = 2
		Output:
		[
		  [2,4],
		  [3,4],
		  [2,3],
		  [1,2],
		  [1,3],
		  [1,4],
		]
 */

public class Combinations {

	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}

	public static List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> res = new ArrayList<>();

		if (k < 1) {
			return res;
		}

		backTrack(res, new ArrayList<>(), n, k, 1);

		return res;
	}

	public static void backTrack(List<List<Integer>> res, List<Integer> cur, int n, int k, int x) {
		if (k == 0) {
			res.add(new ArrayList<Integer>(cur));
			return;
		}

		for (int i = x; i <= n - k + 1; i++) {
			cur.add(i);

			backTrack(res, cur, n, k - 1, i + 1);
			cur.remove(cur.size() - 1);
		}
	}

}
