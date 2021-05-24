package com.chips.design.learn.datastructer.LinkedList;


/**
 * l
 * <p>
 * 有两个逆序的链表
 * <p>
 * 输出两个链表之和
 */
public class AddTwoNumbers {


    public ListNode solution(ListNode l1, ListNode l2) {

        //空头，使链表不为空
        ListNode prev = new ListNode(0);

        ListNode curr = prev;

        int add = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + add;
            add = sum / 10;
            sum = sum % 10;
            ListNode next = new ListNode(sum);
            curr.next = next;
            curr = curr.next;

            //若链表当前不为空则指向下一个节点，此处不用判空
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (add == 1) {
            curr.next = new ListNode(add);
        }

        return prev.next;
    }


}
