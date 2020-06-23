package com.machi.test.math;

public class ListNode {
    private int val;
    private ListNode next;
    public ListNode(int val){
        this.val = val;
        next = null;
    }

    //链表反转
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
