package com.chips.design.learn.cucalate.simple;


public class DeleteNode {


    public void deleteNode(ListNode node) {

        if (node == null) {
            return;
        }

        ListNode curr = node;
        while (curr.next != null) {
            if (curr.next.val == node.val && curr.next.next != null) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

    }
}

