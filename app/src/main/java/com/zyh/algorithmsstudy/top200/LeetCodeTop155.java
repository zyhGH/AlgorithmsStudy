package com.zyh.algorithmsstudy.top200;

import java.util.ArrayList;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//TODO 写的不对
public class LeetCodeTop155 {
    class MinStack {
        int minIndex = -1;
        ArrayList<Integer> list;
        /** initialize your data structure here. */
        public MinStack() {
            list = new ArrayList<>();
        }

        public void push(int val) {
            if (list.isEmpty()) {
                list.add(val);
                minIndex = 0;
            }else {
                if (val < list.get(minIndex)) {
                    minIndex = list.size();
                }
                list.add(val);
            }
        }

        public void pop() {
            list.remove(list.size() - 1);
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int getMin() {
            return list.get(minIndex);
        }
    }
}
