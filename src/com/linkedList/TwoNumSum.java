package com.linkedList;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class TwoNumSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //哨兵节点
        ListNode res = new ListNode(-1);
        ListNode pre = res;
        //临时变量，用于进位
        int temp = 0;
        //当节点都为空并且没有进位时退出循环
        while (l1 != null || l2 != null || temp != 0){
            //当前节点的值，当前节点为null时，赋值为0
            int temp_l1 = l1 == null ? 0 :l1.val;
            int temp_l2 = l2 == null ? 0 :l2.val;
            //计算和
            temp = temp_l1 + temp_l2 + temp;
            //和的个i位数节点
            ListNode node = new ListNode(temp%10);
            //进位
            temp = temp/10;

            pre.next = node;
            pre = pre.next;
            //当链表不为空，才向后移动
            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }

        return res.next;
    }
}
