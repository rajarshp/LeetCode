package com.leetcode.medium;

/*
 * Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.  
 * The guards have gone and will come back in H hours.
 * Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas, 
 * and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead, 
 * and won't eat any more bananas during this hour.
 * Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.
 * 
 * Return the minimum integer K such that she can eat all the bananas within H hours.

		Example 1:
		
		Input: piles = [3,6,7,11], H = 8
		Output: 4
		Example 2:
		
		Input: piles = [30,11,23,4,20], H = 5
		Output: 30
 * 
 * 
 */

public class KokoEatsBanana {

	public static void main(String[] args) {
		System.out.println(minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
	}

	public static int minEatingSpeed(int[] piles, int H) {

		// Arrays.sort(piles);
		int s = 1;
		// int e = Arrays.stream(piles).max().getAsInt();
		// int e = piles[piles.length -1];
		int e = 1_000_000_000;

		while (s <= e) {
			int m = s + (e - s) / 2;
			if (canKokoEat(piles, m, H)) {
				e = m - 1; // to see any optimized value for k
			} else {
				s = m + 1;
			}
		}

		return s;
	}

	public static boolean canKokoEat(int[] p, int k, int h) {
		int hour = 0;

		for (int b : p) {
			hour += (b / k);
			if (b % k != 0) { // if there is extra banana it will take an extra hout to finish
				hour++;
			}
		}

		return hour <= h;
	}

}
