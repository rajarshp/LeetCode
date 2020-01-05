/**
 * 
 */
package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.leetcode.easy.MoveZeros;

/**
 * @author Joker
 *
 */
class MovesZeroTest {
	int[] nums;

	/**
	 * Test method for {@link com.leetcode.easy.MoveZeros#moveZeroes1(int[])}.
	 */
	@Test
	void testMoveZeroes1() {
		nums = new int[] { 0, 1, 2, 3, 0, 12 };
		MoveZeros.moveZeroes1(nums);
		int[] expected = new int[] { 1, 4, 3, 12, 0, 0 };

		assertEquals(expected, nums);

	}

	/**
	 * Test method for {@link com.leetcode.easy.MoveZeros#moveZeroes2(int[])}.
	 */
	@Test
	void testMoveZeroes2() {
		nums = new int[] { 0, 1, 2, 3, 0, 12 };
		MoveZeros.moveZeroes1(nums);
		int[] expected = new int[] { 1, 2, 3, 12, 0, 0 };
		assertArrayEquals(expected, nums);
	}

}
