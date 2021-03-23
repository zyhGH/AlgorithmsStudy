package com.zyh.algorithmsstudy.study.arraylinkedlist;

import java.util.HashMap;

/**
 * 判断是否有环形链表
 * 并返回最后一个索引指向的节点
 */
public class LinkedHasCycle2 {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;
            } else {
                map.put(temp, temp.val);
                temp = temp.next;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode detectCycleTest(ListNode head) {


    }
}
