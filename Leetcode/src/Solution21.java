import org.junit.Test;

public class Solution21 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;

        while (l1!=null&&l2!=null){ //124 356
            if (l1.val>l2.val){
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
            else{
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }
            continue;
        }
        while (l1!=null){
            l3.next = l1;
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2!=null){
            l3.next = l2;
            l3 = l3.next;
            l2 = l2.next;
        }
        return head.next;
    }

    @Test
    public void test21(){
        ListNode listNode4 = new ListNode(4);
        ListNode listNode2 = new ListNode(2,listNode4);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode5 = new ListNode(5,listNode6);
        ListNode listNode3 = new ListNode(1,listNode5);

        Solution21 solution21 = new Solution21();
        //ListNode l = solution21.mergeTwoLists(listNode1,listNode3);
        //System.out.println(l.next.val);
    }
}
