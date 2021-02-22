package com.zyh.algorithmsstudy.study.arraylinkedlist;

import java.util.HashMap;

/**
 * 给定一个链表，判断链表中是否有环
 */
public class LinkedHasCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null) {
            if (map.containsKey(temp)) {
                return true;
            }else {
                map.put(temp, temp.val);
                temp = temp.next;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
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

    public boolean hasCycleTest(ListNode head) {

        return false;
    }
}
