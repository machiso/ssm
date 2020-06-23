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

    //判断链表是否有节点
    public boolean ifHasCircle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //两个链表合并
    public ListNode mergeListNode(ListNode l1,ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val<l2.val){
            l1.next = mergeListNode(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeListNode(l1,l2.next);
            return l2;
        }
    }
}
