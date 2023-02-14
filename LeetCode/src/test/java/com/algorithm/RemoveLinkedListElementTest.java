package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementTest {

    @Test
    void removeElementsOK() {
        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        RemoveLinkedListElement.ListNode listNode = new RemoveLinkedListElement.ListNode(1);
        listNode.next = new RemoveLinkedListElement.ListNode(2);
        listNode.next.next = new RemoveLinkedListElement.ListNode(6);
        listNode.next.next.next = new RemoveLinkedListElement.ListNode(3);
        listNode.next.next.next.next = new RemoveLinkedListElement.ListNode(4);
        listNode.next.next.next.next.next = new RemoveLinkedListElement.ListNode(5);
        listNode.next.next.next.next.next.next = new RemoveLinkedListElement.ListNode(6);

        RemoveLinkedListElement.ListNode node = removeLinkedListElement.removeElements(listNode, 6);
        Assertions.assertTrue(node.next.next.val == 3);

    }
}