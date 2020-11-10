package com.swapnil.leetcode;

/*

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3],
       l2 = [5,6,4]
Output:     [7,0,8]
Explanation: 342 + 465 = 807.
*/


// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode dummyCurr = new ListNode(0);
        ListNode a1 = new ListNode();
        a1 = dummyCurr;
        dummyCurr.val = 2;
        dummyCurr.next = new ListNode(4);
        dummyCurr = dummyCurr.next;
        dummyCurr.next = new ListNode(3,null);

        ListNode dummyCurrA2 = new ListNode(0);
        ListNode a2 = dummyCurrA2;
        dummyCurrA2.val = 5;
        dummyCurrA2.next = new ListNode(6, new ListNode(4,null));
//        dummyCurrA2 = dummyCurrA2.next;
//        dummyCurrA2.next = new ListNode(4,null);

        ListNode output = addTwoNumbers(a1,a2);

        //print the output list
        while(output!=null){
            System.out.print(output.val + " ");
            output = output.next;
        }


    }

    private static ListNode addTwoNumbers(ListNode a1, ListNode a2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode p1=a1, p2=a2, curr = dummyNode;
        int carry =0;

        while(p1!=null || p2!=null){
           int x= p1 != null ? p1.val : 0;
           int y= p2 != null ? p2.val : 0;
           int digit = carry + x + y;

           carry = digit / 10;

           curr.next = new ListNode(digit % 10);
           curr = curr.next;
//           curr = curr.next;
           if(p1 !=null) p1 = p1.next;
           if(p2 !=null) p2 = p2.next;
        }
        if(carry > 0) curr.next = new ListNode(carry);

        return dummyNode.next;
    }

}
