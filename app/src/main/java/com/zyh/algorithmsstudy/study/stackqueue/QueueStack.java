package com.zyh.algorithmsstudy.study.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的全部四种操作（push、top、pop 和 empty）。
 *
 * 实现 MyStack 类：
 *
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 */
public class QueueStack {
    class MyStack {
        Queue<Integer> input;
        Queue<Integer> output;

        public MyStack() {
            input = new LinkedList<>();
            output = new LinkedList<>();
        }

        public void push(int x) {
            output.offer(x);

            while (!output.isEmpty()) {
                input.offer(output.poll());
            }
        }

        public int pop() {
            while (!input.isEmpty()) {
                output.offer(input.poll());
            }
            return output.poll();
        }

        public int top() {
            while (!input.isEmpty()) {
                output.offer(input.poll());
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
