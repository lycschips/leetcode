package com.chips.design.learn.cucalate.simple;

/**
 * 合并两个有序链表
 */
public class MergeTwoLists {


    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode pref = new ListNode(0);
        ListNode curr = pref;
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 == null) curr.next = l2;
        if (l2 == null) curr.next = l1;
        return pref.next;
    }


}
