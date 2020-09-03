package com.linkedList;

import java.util.*;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 * 进阶：
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 */
public class RingLinkedList {
    /**
     * 方法一：Set法
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            //判断当前节点是否在set中
            if (set.contains(head)){
                return true;
            }
            //将遍历后但不在set中的节点存入
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 方法二：快慢指针
     */
    public boolean hasCycle_pointer(ListNode head){
        //空链表
        if(head==null || head.next==null) {
            return false;
        }
        //快慢指针
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            if (slow.equals(fast)){
                return true;
            }
            //快指针走两步，慢指针走一步
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
