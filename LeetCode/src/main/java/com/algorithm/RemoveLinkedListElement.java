package com.algorithm;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveLinkedListElement {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode recurNode = removeElements(head.next, val);
        if (head.val == val){
            return recurNode;
        }
        head.next = recurNode;
        return head;
    }

}
