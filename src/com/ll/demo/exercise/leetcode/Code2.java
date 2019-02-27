package com.ll.demo.exercise.leetcode;

import com.ll.demo.exercise.leetcode.common.ListNode;

/**
 * 2.两数相加
 *
 * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author ll
 * @date 2019/2/26 2:46 PM
 */
public class Code2 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(7);
        node2.next = node1;
        ListNode node3 = new ListNode(7);
        node3.next = node2;

        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(7);
        n2.next = n1;
        ListNode n3 = new ListNode(7);
        n3.next = n2;

        ListNode listNode = addTwoNumbers(node3, n3);

        StringBuilder sb = new StringBuilder();
        while (listNode!=null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("结果：" + sb.toString());
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }




}
