package com.test.linkedList;

import com.linkedList.ListNode;
import com.linkedList.MergeLinkedList;

public class MergeLinkedListTest {
    public static void main(String[] args) {
        MergeLinkedList mergeLinkedList = new MergeLinkedList();
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};
        l1 = l1.add(nums1,l1);
        l2 = l2.add(nums2,l2);
        //查看链表内容
        System.out.println(l1);
        System.out.println(l2);

        System.out.println(mergeLinkedList.mergeTwoLists(l1,l2));
    }
}
