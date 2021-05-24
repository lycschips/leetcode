package com.chips.design.learn.datastructer.LinkedList;


/**
 * 删除链表中的所有的指定元素
 */
public class DeleteValueFromList {


    public ListNode removeElements(ListNode head, int val) {

        //引用哨兵节点
        ListNode sentinel = new ListNode(0);

        ListNode pref = sentinel;

        ListNode curr = head;

        while (curr!=null){

            if (curr.val==val){
                pref.next=curr.next;
            }else {
                pref=curr;
            }
            curr=curr.next;
        }
        return sentinel.next;
    }


}
