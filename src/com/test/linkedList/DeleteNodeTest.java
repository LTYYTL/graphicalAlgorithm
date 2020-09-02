package com.test.linkedList;

import com.linkedList.DeleteNode;
import com.linkedList.ListNode;

public class DeleteNodeTest {
    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();

        int[] nums = {1,2,3,4,5};
        ListNode res = new ListNode(-1);
        res = res.add(nums,res);

        System.out.println(deleteNode.removeNthFromEnd(res,2));

    }
}
