package com.zyh.algorithmsstudy.study.arraylinkedlist;

/**
 * 两两交换链表中的节点
 */

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode nullNode = new ListNode(0);
        nullNode.next = head;
        ListNode cur = nullNode;
        while(cur.next != null && cur.next.next != null) {
            ListNode a = cur.next;
            ListNode b = cur.next.next;
            cur.next = b;
            a.next = b.next;
            b.next = a;
            cur = cur.next.next;
        }
        return nullNode.next;
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
}
