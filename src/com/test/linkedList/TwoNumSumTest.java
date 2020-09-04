package com.test.linkedList;

import com.linkedList.ListNode;
import com.linkedList.TwoNumSum;

public class TwoNumSumTest {
    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        //构建两个链表
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};

        ListNode l1 = new ListNode();
        l1 = l1.add(nums1,l1);
        ListNode l2 = new ListNode();
        l2 = l2.add(nums2,l2);
        //查看两个链表
        System.out.println(l1);
        System.out.println(l2);

        System.out.println(twoNumSum.addTwoNumbers(l1,l2));
    }
}
