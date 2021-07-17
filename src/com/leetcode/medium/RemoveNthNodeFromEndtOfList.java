package com.leetcode.medium;

import com.leetcode.easy.ValidParentheses;
import com.leetcode.util.ListNode;

//leetcode #19
public class RemoveNthNodeFromEndtOfList {

    public static void main(String[] args) {
        RemoveNthNodeFromEndtOfList remove = new RemoveNthNodeFromEndtOfList();
        ListNode head = new ListNode(1);
        ListNode t2 = new ListNode(2);
        head.next = t2;
        ListNode t3 = new ListNode(3);
        t2.next = t3;
        ListNode t4 = new ListNode(4);
        t3.next = t4;
        ListNode t5 = new ListNode(5);
        t4.next = t5;

        remove.removeNthFromEnd(head, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int size = 0;
        ListNode temp = head;

        while (temp != null){
            size++;
            temp = temp.next;
        }

        size = size - n;
        temp = dummy;
        while (size>0){
            temp = temp.next;
            size--;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
