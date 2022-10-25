package baseExercise;

import java.util.Arrays;

/**
 * @author : Jason.ma
 * @date : 2022/7/28 10:22
 */
public class ThreeSumClosest0016 {
    public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        //1.排序
        Arrays.sort(nums);
        //2.遍历查找最接近
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int newR = nums[i] + nums[left] + nums[right];
                //新值更接近就替换result
                if (Math.abs(newR - target) < Math.abs(result - target)){
                    result = newR;
                }
                //判断是移动left还是right
                if (newR < target){
                    left++;
                } else if (newR > target){
                    right--;
                } else {
                    return newR;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints1 = {-1, 2, 1, -4};
        int[] ints2 = {0,0,0};
        int i1 = threeSumClosest(ints1, 1);
        int i2 = threeSumClosest(ints2, 1);
        System.out.println(i1);
        System.out.println(i2);
    }
}
