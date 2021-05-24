package com.chips.design.learn.datastructer.LinkedList;

/**
 * 扁平化多级链表
 * <p>
 * 基础结构为双向链表包含子链表，需将多级链表合并，为扁平化链表
 *
 * 此题解的思路就是该复杂链表顺时针旋转90度当作二叉树处理，即处理二叉树的前序遍历
 */
public class Flatten {


    public Node solution(Node head){

        if (head==null){
            return head;
        }

        if (head == null) return head;
        // pseudo head to ensure the `prev` pointer is never none
        Node pseudoHead = new Node(0, null, head, null);

        flattenDFS(pseudoHead, head);

        // detach the pseudo head from the real head
        pseudoHead.next.prev = null;
        return pseudoHead.next;
    }

    /* return the tail of the flatten list */

    public Node flattenDFS(Node prev, Node curr) {
        if (curr == null) return prev;
        curr.prev = prev;
        prev.next = curr;

        // the curr.next would be tempered in the recursive function
        Node tempNext = curr.next;

        Node tail = flattenDFS(curr, curr.child);
        curr.child = null;

        return flattenDFS(tail, tempNext);
    }

}
