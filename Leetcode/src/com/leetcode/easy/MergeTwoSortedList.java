package com.leetcode.easy;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together 
 * the nodes of the first two lists.

		Example:

			Input: 1->2->4, 1->3->4
			Output: 1->1->2->3->4->4
 */

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode res = null;
		ListNode prev = null;

		while (l1 != null & l2 != null) {
			if (l1.val < l2.val) {
				// ListNode temp = new ListNode(l1.val);
				if (res == null) {
					res = l1;
					prev = res;
				} else {
					prev.next = l1;
					prev = l1;
				}
				l1 = l1.next;
			} else {
				// ListNode temp = new ListNode(l2.val);
				if (res == null) {
					res = l2;
					prev = res;
				} else {
					prev.next = l2;
					prev = l2;
				}
				l2 = l2.next;
			}
		}
		while (l1 != null) {
			// ListNode temp = new ListNode(l1.val);
			if (res == null) {
				res = l1;
				prev = res;
			} else {
				prev.next = l1;
				prev = l1;
			}
			l1 = l1.next;
		}
		while (l2 != null) {
			// ListNode temp = new ListNode(l2.val);
			if (res == null) {
				res = l2;
				prev = res;
			} else {
				prev.next = l2;
				prev = l2;
			}
			l2 = l2.next;
		}
		return res;
	}

}
