package com.algorithm;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
public class ReverseSingleLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newTail = null;
        if (head.next == null) {
            return head;
        }
        newTail = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newTail;
    }

    public ListNode reverseListLoop(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = null;
        while (head != null) {
            ListNode newList = head.next;
            head.next = newHead;
            newHead = head;
            head = newList;
        }
        return newHead;
    }
}
