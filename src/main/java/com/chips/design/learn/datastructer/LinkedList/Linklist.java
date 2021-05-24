package com.chips.design.learn.datastructer.LinkedList;


class ListNode {

    //存储值
    int val;

    //存储链表得下个地址
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}


public class Linklist {

    //伪头
    private ListNode head;

    //链表长度
    private int size;

    public Linklist() {
        head = new ListNode(0);
        size = 0;
    }

    public int get(int index) {

        //非法值返回-1
        if (index < 0 || index > size) {
            return -1;
        }

        ListNode curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = head.next;
        }
        return curr.val;

    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {

        //去除边界条件
        if (index > size) {
            return;
        }

        if (index < 0) {
            index = 0;
        }

        ++size;

        ListNode pef = head;

        ListNode cur = new ListNode(val);

        for (int i = 0; i < index; i++) {
            pef = head.next;
        }
        cur.next = pef.next;
        pef.next = cur;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
// if the index is invalid, do nothing
        if (index < 0 || index >= size) return;

        size--;
        // find predecessor of the node to be deleted
        ListNode pred = head;
        for (int i = 0; i < index; ++i) pred = pred.next;

        // delete pred.next
        pred.next = pred.next.next;
    }


}
