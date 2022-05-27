package offer;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  
 *
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 *
 *  
 *
 * 限制：
 *
 * 0 <= n <= 1000
 *
 * 0 <= m <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author : Jason.ma
 * @date : 2022/5/27 14:15
 */
public class Offer04 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        //看成图,设置出发点应满足的条件为,一侧大于自己一侧小于自己一次只往一侧走;在n*m的二位数组中选择(n-1,0);
        int localX = matrix.length - 1;
        int localY = 0;
        while (true){
            try {
                int localVal = matrix[localX][localY];
                if (localVal == target){
                    return true;
                } else if (localVal > target){
                    localX -= 1;
                } else {
                    localY += 1;
                }
            } catch (Exception e){
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        ints[0] = new int[]{1,4,7,11,15};
        ints[1] = new int[]{2,5,8,12,19};
        ints[2] = new int[]{3,6,7,16,22};
        ints[3] = new int[]{10,13,14,17,24};
        ints[4] = new int[]{18,21,23,26,30};

        System.out.println(findNumberIn2DArray(ints,5));
        System.out.println(findNumberIn2DArray(ints,20));
    }
}
