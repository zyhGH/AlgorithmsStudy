package com.zyh.algorithmsstudy.allquestion;

public class Number2 {
    public static void main(String[] args) {

    }

    /**
     * 为什么需要pre和cur两个链表
     * 因为cur每次都会被赋值成cur.next
     * 所以导致最后的结果cur一定是空的
     * pre是一直不变的 但它赋值给了cur
     * 每次cur.next更改 他也被更改了
     * 所以最后返回pre.next
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;

            cur.next = new ListNode(sum % 10);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static class ListNode {
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
