package offer;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *   
 *
 * 限制：
 *
 * 2 <= n <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashSet;

/**
 * @author : Jason.ma
 * @date : 2022/5/27 10:34
 */
public class Offer03 {
    //太慢
//    public int findRepeatNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])){
//                return nums[i];
//            }else {
//                set.add(nums[i]);
//            }
//        }
//        return 0;
//    }

    /**
     * 上述方法虽然简单但是速度太慢,set.contains 性能还是不行,这里采用用内存来换时间. key:在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内
     * @param nums
     * @return
     */
    public int betterResult(int[] nums) {
        int[] judge = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (judge[nums[i]] == 1){
                return nums[i];
            } else {
                judge[nums[i]] = 1;
            }
        }
        return 0;
    }

    public int bestResult(int[] nums){
        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[nums[i]];
            nums[temp] = temp;
        }
        return 0;
    }
}
