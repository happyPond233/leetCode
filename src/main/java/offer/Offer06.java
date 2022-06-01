package offer;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *   
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *   
 *
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author : Jason.ma
 * @date : 2022/5/27 15:03
 */
public class Offer06 {

    public int[] reversePrint(ListNode head) {
        int listLength = 0;
        ListNode p = head;
        while (p != null){
            listLength++;
            p = p.next;
        }
        int[] result = new int[listLength];
        ListNode q = head;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = q.val;
            q = q.next;
        }
        return result;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
