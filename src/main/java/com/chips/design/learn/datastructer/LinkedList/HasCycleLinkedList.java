package com.chips.design.learn.datastructer.LinkedList;


import java.util.HashSet;
import java.util.Set;

/**
 * 求链表中是否存再环
 * <p>
 * 解法1：使用hash表，将数据放入Hash表中若出现重复的对象则证明链表有环
 * <p>
 * 解法2:使用双指针向后扫描，快慢指针存在步长差，如果存在环，则快指针必然会追上慢指针
 */
public class HasCycleLinkedList {


    /**
     * hash表法
     *
     * @return 是否存在环
     */
    public Boolean solution1(ListNode head) {

        Set<ListNode> set = new HashSet<ListNode>();
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }


    /**
     * 快慢指针法
     *
     * @return 是否存在环
     */
    public Boolean solution2(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode quickPtr = head.next;
        ListNode slowPtr = head;
        while (quickPtr != slowPtr) {
            if (quickPtr == null || quickPtr.next == null) {
                return false;
            }
            quickPtr = quickPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return true;
    }


    /**
     * 快慢指针的另一种循环思路
     *
     * @return 是否存在还
     */
    public Boolean solution3(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode quickPtr = head.next;

        ListNode slowPtr = head;

        while (quickPtr != null && quickPtr.next != null) {
            if (slowPtr == quickPtr) {
                return true;
            }
            quickPtr = quickPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return false;

    }

}
