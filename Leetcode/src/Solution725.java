public class Solution725 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }



    public static ListNode[] splitListToParts(ListNode head, int k) {
        // 扫描链表，得到总长度 cnt
        int cnt = 0;
        ListNode tmp = head;
        while (tmp != null && ++cnt > 0) tmp = tmp.next;
        // 理论最小分割长度
        int per = cnt / k;
        // 将链表分割为 k 份（sum 代表已经被处理的链表长度为多少）
        ListNode[] ans = new ListNode[k];
        for (int i = 0, sum = 1; i < k; i++, sum++) {
            ans[i] = head;
            tmp = ans[i];
            // 每次首先分配 per 的长度
            int u = per;
            while (u-- > 1 && ++sum > 0) tmp = tmp.next;
            // 当「已处理的链表长度 + 剩余待分配份数 * per < cnt」，再分配一个单位长度
            int remain = k - i - 1;
            if (per != 0 && sum + per * remain < cnt && ++sum > 0) tmp = tmp.next;
            head = tmp != null ? tmp.next : null;
            if (tmp != null) tmp.next = null;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode l10 = new ListNode(10);
        ListNode l9 = new ListNode(9,l10);
        ListNode l8 = new ListNode(8,l9);
        ListNode l7 = new ListNode(7,l8);
        ListNode l6 = new ListNode(6,l7);
        ListNode l5 = new ListNode(5,l6);
        ListNode l4 = new ListNode(4,l5);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);

        ListNode[] ans = splitListToParts(l1,3);
        for (ListNode a : ans) {
            System.out.println(a);
        }
    }
}
