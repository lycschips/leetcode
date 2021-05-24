package com.chips.design.learn.datastructer.LinkedList;

/**
 * 奇偶链表，将链表的奇数节点和偶数节点分别相连，并将偶数节点放置再奇数节点的后面
 * <p>
 * 最直观的思路是将奇数节点和偶数节点分别放置再两个链表中，最后将偶数链表缀再奇数链表后面
 */
public class OddEvenList {


    public ListNode solution(ListNode head) {

        //空指针保护
        if (head == null) return null;

        //奇数节点指针
        ListNode odd = head;

        //偶节点指针
        ListNode even = head.next;

        //偶节点链表
        ListNode evenHead = even;

         //因为偶指针始终先于奇数指针向前推进，故使用偶指针作为
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


}
