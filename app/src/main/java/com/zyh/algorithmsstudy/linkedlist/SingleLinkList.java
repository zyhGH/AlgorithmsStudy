package com.zyh.algorithmsstudy.linkedlist;


/**
 * 单链表的实现
 */
public class SingleLinkList {
    private int size;
    private SingleNode head;
    private int current = 0;

    public SingleLinkList(int capacity) {
        size = capacity;
        head = new SingleNode();
    }

    public void addNode(SingleNode node) {
        if (current == 0)
            head.next = node;
        current++;
    }

    private SingleNode findLastNode() {
        return head;
    }

}
