package com.putact.buzz;

import java.util.*;

public class ListNodeDemo {

     String destCity(List<List<String>> paths) {

        String destCity="";
        List<String> beginCitys=new ArrayList<String>(paths.size());


        for (int i=0;i<paths.size();i++){
            beginCitys.add(paths.get(i).get(0));
        }

        for (int i=0;i<paths.size();i++){
            destCity=  paths.get(i).get(0);
            if (!beginCitys.contains(destCity)){
                return destCity;
            }
        }

        return  destCity;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);

        listNode.next=listNode1;
        listNode1.next=listNode2;

        ListNode listNodex = new ListNode(1);
        ListNode listNodey = new ListNode(0);
        ListNode listNodez = new ListNode(1);

        listNodex.next=listNodey;
        listNodey.next=listNodez;

        ListNodeDemo tt = new ListNodeDemo();
        System.out.print(tt.getDecimalValue(listNode));

        System.out.print(tt.getIntersectionNode(listNode,listNodex).val);
        String ts ="";
        //ts.charAt()


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap<Integer,ListNode> firstHad = new   HashMap<Integer,ListNode>();
        ListNode  tempA= headA;
        ListNode  tempB= headB;
        List<ListNode> firstHads = new ArrayList<ListNode>();


        while (tempA!=null){
            firstHad.put(tempA.val,tempA);
            tempA = tempA.next;
        }

        while (tempB!=null){

             if(firstHad.containsValue(tempB)){
                 return tempB;
             }
             tempB=tempB.next;

        }

        return null;
    }


        public int getDecimalValue(ListNode head) {
            StringBuffer val = new StringBuffer();
            while (head != null) {
                val.append(String.valueOf(head.val));
                head=head.next;
            }

            int r = Integer.valueOf(val.toString(),2);
            Integer.toHexString(10);

            return r;
        }


}

//* Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

