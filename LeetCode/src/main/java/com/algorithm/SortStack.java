package com.algorithm;

import java.util.Stack;

public class SortStack {
    public void sortStack(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            int top = stack.pop();
            while (!temp.isEmpty() && temp.peek() < top){
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
}
