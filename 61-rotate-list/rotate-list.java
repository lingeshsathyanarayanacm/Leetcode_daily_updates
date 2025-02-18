import java.util.ArrayList;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null || k==0)return head;
       ArrayList<Integer> cse = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            cse.add(curr.val);
            curr = curr.next;
        }
        int n=cse.size();
        k=k%n;
        ArrayList<Integer> rotate=new ArrayList<>();
        rotate.addAll(cse.subList(n-k,n));
        rotate.addAll(cse.subList(0,n-k));
        curr=head;
        for (int i = 0; i < n; i++) {
            curr.val = rotate.get(i);
            curr = curr.next;
        }

        return head;

    }
}
