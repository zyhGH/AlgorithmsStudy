package com.zyh.algorithmsstudy.study.stackqueue;

import java.util.Stack;

/**
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：
 *
 * 实现 MyQueue 类：
 *
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
public class StackQueue {


    class MyQueue {
        Stack<Integer> input;
        Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            while(!output.isEmpty()) {
                input.push(output.pop());       //这是为了将输出栈所有元素又回到输入栈 否则会如果直接push
            }                                   //进输入栈的话 再次输出就会在output的栈顶
            input.push(x);
        }

        public int pop() {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
            return output.pop();
        }

        public int peek() {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
