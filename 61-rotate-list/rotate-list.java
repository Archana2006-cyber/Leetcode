import java.util.*;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0)
        return head;

        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        int size=0;

        while(temp!=null)
        {
            stack.push(temp);
            temp=temp.next;
            size=size+1;
        }

        int count=0;
        k=k%size;

        while(count<k && stack.size()>0)
        {
            ListNode curr=stack.pop();
            curr.next=head;
            head=curr;
            count++;
        }

        ListNode tail=head;
        for(int i=1;i<size;i++)
        {
            tail=tail.next;
        }
        tail.next=null;

        return head;
    }
}