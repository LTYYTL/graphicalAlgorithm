package com.linkedList;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //设置哨兵节点
        ListNode prehead = new ListNode(-1);
        ListNode pre = prehead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        //三目运算符，将没有比较完的直接赋值给链表
        pre.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
