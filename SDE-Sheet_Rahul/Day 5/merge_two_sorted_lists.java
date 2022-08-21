/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        // To keeep l1 as the smallest one for the 1st iteration
        if(l1.val >l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }   
    
    ListNode temp= null,head = l1;
    
    while(l1.next != null){
        
        if(l1.next.val >l2.val){
    
            temp = l1.next;
            l1.next = l2;
            l1 = l2;
            l2  = temp;
        }else{
            l1= l1.next;
        }
    }
    l1.next = l2;
    
    return head;
    }
}

//Recursive
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val>l2.val){
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }else{
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
    }
}