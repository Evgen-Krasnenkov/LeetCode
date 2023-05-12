package com.algorithm;

import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/
 */
public class DayTemperature {
    class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(temperatures.length - 1, temperatures[temperatures.length - 1]));
        result[temperatures.length - 1] = 0;
        for (int i = temperatures.length - 2; i >= 0; i--) {
            while (!stack.empty() && stack.peek().value < temperatures[i]) {
                stack.pop();
            }
            if (stack.empty()) {
                result[i] = 0;
                stack.push(new Node(i,temperatures[i]));
            } else {
            Node peek = stack.peek();
            result[i] = peek.index - i;
            stack.push(new Node(i, temperatures[i]));
        }
    }
        return result;
    }

    public int[] dailyAi(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
