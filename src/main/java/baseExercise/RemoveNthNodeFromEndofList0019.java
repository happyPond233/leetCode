package baseExercise;

/**
 * @author : Jason.ma
 * @date : 2022/11/2 10:05
 */
public class RemoveNthNodeFromEndofList0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //增加头节点
        ListNode result = new ListNode(0,head);
        ListNode p = head;
        ListNode q = result;
        int local = 1;
        while (p.next != null){
            p = p.next;
            local++;
            if (local > n){
                q = q.next;
            }
        }
        q.next = q.next.next;
        return result.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndofList0019 removeNthNodeFromEndofList0019 = new RemoveNthNodeFromEndofList0019();
//        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))),5));
//        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))),1));
        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1),1));
        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1,new ListNode(2)),2));
        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1,new ListNode(2)),1));
        System.out.println(removeNthNodeFromEndofList0019.removeNthFromEnd(new ListNode(1,new ListNode(2,new ListNode(3))),2));
//        2 ---> 3 ---> 4 ---> 5
//        1 ---> 2 ---> 3 ---> 4
//        null
//        2
//        1
//        1 ---> 3
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        if (next == null){
            return val + "";
        } else {
            return val +
                    " ---> " + next;
        }
    }
}
