package baseExercise;

import java.util.Arrays;

/**
 * @author : Jason.ma
 * @date : 2022/7/28 10:22
 */
public class ThreeSumClosest0016 {
    public static int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int minDValue = Integer.MAX_VALUE;

        //1.排序
        Arrays.sort(nums);
        int head = 0;
        int tail = nums.length - 1;
        while (head < tail - 1){
            int threeSum = 0;
            int dValue = 0;
            int headNum  = nums[head];
            int tailNum = nums[tail];
            //2.遍历查找最小值
            for (int i = head + 1; i < tail; i++) {
                int num = nums[i];
                threeSum = headNum + tailNum + num;
                dValue = Math.abs(threeSum - target);
                if (dValue < minDValue){
                    minDValue = dValue;
                    result = threeSum;
                }
            }
            if (head == tail - 2){
                head = 0;
                tail--;
            }else {
                head++;
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
