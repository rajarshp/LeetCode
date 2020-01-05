package com.leetcode.easy;

/*
 * Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

		Example 1:
		
		Input: a = "11", b = "1"
		Output: "100"
		Example 2:
		
		Input: a = "1010", b = "1011"
		Output: "10101"
 */

public class AddBinary {
	public String addBinary(String a, String b) {

//      BigInteger a1 = new BigInteger("0");
//		BigInteger b1 = new BigInteger("0");
//		StringBuilder sb = new StringBuilder();

//		BigInteger base = BigInteger.valueOf(1);

//		int len = a.length();
//		for (int i = len - 1; i >= 0; i--) {
//			if (a.charAt(i) == '1') {
//				a1 = a1.add(base);
//			}

//			base = base.multiply(BigInteger.valueOf(2));
//		}

//		base = BigInteger.valueOf(1);

//		len = b.length();
//		for (int i = len - 1; i >= 0; i--) {
//			if (b.charAt(i) == '1') {
//				b1 = b1.add(base);
//			}

//			base = base.multiply(BigInteger.valueOf(2));
//		}

//		BigInteger sum = a1.add(b1);

//		if (sum.equals(BigInteger.valueOf(0))) {
//			return "0";
//		}

//		while (sum.compareTo(BigInteger.valueOf(0)) > 0) {
//			BigInteger d = sum.mod(BigInteger.valueOf(2));
//			sum = sum.divide(BigInteger.valueOf(2));
//			sb.append(d);
//		}

		// SOLUTION FROM DISCUSSION

		StringBuilder sb = new StringBuilder();

		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}

}
