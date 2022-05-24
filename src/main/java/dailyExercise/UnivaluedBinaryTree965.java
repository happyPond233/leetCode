package dailyExercise;

/**
 * A binary tree is uni-valued if every node in the tree has the same value.
 *
 * Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
 *
 *
 * Example 1:
 * Input: root = [1,1,1,1,1,null,1]
 * Output: true
 *
 *
 * Example 2:
 * Input: root = [2,2,2,5,2]
 * Output: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/univalued-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jason.ma
 * @date : 2022/5/24 17:32
 */
public class UnivaluedBinaryTree965 {

    /**
     * 无论是哪种遍历感觉效率都一致
     * @param root
     * @return
     */
    public static boolean isUnivalTree(TreeNode root) {
        //层级遍历
        List<TreeNode> nodeList = new ArrayList<>();
        int firstNum = root.val;
        nodeList.add(root);
        return isUnivalTree(firstNum,nodeList);
    }

    public static boolean isUnivalTree(int value , List<TreeNode> nodeList){
        if (nodeList.size() != 0){
            TreeNode node = nodeList.get(0);
            if (node.right != null){
                if (node.right.val != value){
                    return false;
                }
                nodeList.add(node.right);
            }
            if (node.left != null){
                if (node.left.val != value){
                    return false;
                }
                nodeList.add(node.left);
            }
            nodeList.remove(node);
        } else {
            return true;
        }
        return isUnivalTree(value,nodeList);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)), new TreeNode(1, null, new TreeNode(1)));
//        TreeNode treeNode = new TreeNode(2, new TreeNode(2, new TreeNode(5), new TreeNode(2)), new TreeNode(2, null, new TreeNode(2)));
        System.out.println(isUnivalTree(treeNode));
    }
}

