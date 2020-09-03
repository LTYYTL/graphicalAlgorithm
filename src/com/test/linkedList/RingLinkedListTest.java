package com.test.linkedList;

import com.linkedList.ListNode;
import com.linkedList.RingLinkedList;

public class RingLinkedListTest {
    public static void main(String[] args) {
        RingLinkedList ringLinkedList = new RingLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node2;没有制造出带环形链表
        System.out.println(node1);

        System.out.println(ringLinkedList.hasCycle(node1));
        System.out.println(ringLinkedList.hasCycle_pointer(node1));

    }
}
