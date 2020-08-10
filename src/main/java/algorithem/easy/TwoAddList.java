package algorithem.easy;

public class TwoAddList {
    public static void main(String args[]) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);

        ListNode q = l2;
        ListNode p= l1;

        ListNode current = dummyHead;

        int carry = 0;
        while (p!=null|| q!=null){

            int x = p!=null?p.val:0;
            int y = q!=null?q.val:0;
            int sum = x+y +carry;
            carry = sum/10;
            current.next= new ListNode(sum%10);

            if (p != null) {
                p = p.next;

            }
            if (q != null){
                q = q.next;
            }

        }

        if (carry>0){
            current.next = new ListNode(carry);

        }

        return dummyHead.next;


    }

}


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
