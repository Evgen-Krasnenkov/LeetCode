package com.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSingleLinkedListTest {
    @Test
    void givenListItems_thenReverse(){
        int[] ints = {1, 2, 3, 4, 5};
        ListNode list = generateList(ints);
        System.out.println(list);
        ReverseSingleLinkedList reverseSingleLinkedList = new ReverseSingleLinkedList();
        ListNode listNode = reverseSingleLinkedList.reverseList(list);
        System.out.println(listNode);
    }

    private static ListNode generateList(int[] ints) {
        if (ints == null || ints.length == 0) {
            return null;
        }
        ListNode mockHead = new ListNode();
        ListNode current = mockHead;
        for (int i = 0; i < ints.length; i++) {
            int number = ints[i];
            current.next = new ListNode(number);
            current = current.next;
        }
        return  mockHead.next;
    }

}
