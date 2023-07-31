package com.algorithm;
/**
 https://leetcode.com/problems/reverse-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
public class ReverseSingleLinkedList {
        public ListNode reverseList(ListNode head) {
            if (head == null)
                    return null;
            ListNode newLast = new ListNode(head.val, null);
            ListNode current = head.next;
            while (current != null){
                ListNode listNode = new ListNode(current.val, newLast);
                newLast = listNode;
                current = current.next;
        }
            return newLast;
    }
}
