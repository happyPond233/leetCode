package baseExercise;

/**
 * 给你两个  非空 的链表，表示两个非负的整数。它们每位数字都是按照  逆序  的方式存储的，并且每个节点只能存储  一位  数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 *   
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *   
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author : Jason.ma
 * @date : 2022/5/26 11:25
 */
public class AddTwoNumbers0002 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //初始化
        boolean overTen = false;
        int sum = l1.val + l2.val;
        overTen = sum > 9 ? true : false;
        int firstVal = sum % 10;
        ListNode result = new ListNode(firstVal);
        ListNode realResult = result;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null){
            int val = 0;
            if(overTen){
                val =  (l1.val + l2.val + 1) % 10;
            } else {
                val = (l1.val + l2.val) % 10;
            }
            if (overTen){
                overTen = (l1.val + l2.val + 1)/10 > 0 ? true : false;
            } else {
                overTen = (l1.val + l2.val)/10 > 0 ? true : false;
            }
            result.next = new ListNode(val);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null){
            result.next = l1;
            while (overTen && l1 != null){
                int val = l1.val + 1;
                overTen = val / 10 > 0 ? true : false;
                if (overTen){
                    l1.val = 0;
                } else {
                    l1.val = val;
                }
                l1 = l1.next;
                if (l1 != null) {
                    result = l1;
                }
            }
        }
        if (l2 != null){
            result.next = l2;
            while (overTen && l2 != null){
                int val = l2.val + 1;
                overTen = val / 10 > 0 ? true : false;
                if (overTen){
                    l2.val = 0;
                } else {
                    l2.val = val;
                }
                l2 = l2.next;
                if (l2 != null) {
                    result = l2;
                }
            }
        }
        if (overTen){
            if (result.next == null) {
                result.next = new ListNode(1);
            } else {
                result.next.next = new ListNode(1);
            }
        }
        return realResult;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            if (next == null){
                return val+"";
            } else {
                return val + "--->" + next;
            }
        }
    }

    public static void main(String[] args) {
//        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        System.out.println(addTwoNumbers(node2,node1));
//        ListNode node3 = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
//        ListNode node4 = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9))));
//        System.out.println(addTwoNumbers(node4,node3));
        ListNode node5 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode node6 = new ListNode(5, new ListNode(6, new ListNode(4,new ListNode(9))));
        System.out.println(addTwoNumbers(node5,node6));
    }
}



