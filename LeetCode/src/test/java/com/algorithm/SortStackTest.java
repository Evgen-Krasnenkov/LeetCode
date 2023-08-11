package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class SortStackTest {

    @Test
    public void givenStack_whenSorting_thenOk() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(3);
        SortStack sortStack = new SortStack();
        sortStack.sortStack(stack);
        Assertions.assertEquals(9, stack.peek());
    }

}
