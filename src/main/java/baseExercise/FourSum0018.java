package baseExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Jason.ma
 * @date : 2022/10/26 09:51
 */
public class FourSum0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        //从前往后遍历
        for (int head = 0; head < nums.length - 3; head++) {
            //一样的跳过
            if (head > 0 && nums[head-1] == nums[head]){
                continue;
            }
            //前四个数加起来大于目标值跳出循环
            if ((long)nums[head] + nums[head+1] + nums[head+2] + nums[head+3] >target){
                break;
            }
            //头加最大的三个数小于目标值跳出循环
            if ((long)nums[nums.length-4] + nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3] < target){
                break;
            }
            //从后往head遍历
            for (int tail = nums.length - 1; tail > head; tail--) {
                //一样的跳过
                if (tail < nums.length - 1 && nums[tail] == nums[tail + 1]){
                    continue;
                }
                int left = head + 1;
                int right = tail - 1;
                while (left < right){
                    if (target == nums[head] + nums[left] + nums[right] + nums[tail]){
                        result.add(Arrays.asList(nums[head],nums[left],nums[right],nums[tail]));
                        do {
                            left++;
                        } while (left < nums.length && nums[left] == nums[left-1]);
                        do {
                            right--;
                        } while (right >= 0 && nums[right] == nums[right+1]);
                    } else if (target < nums[head] + nums[left] + nums[right] + nums[tail]){
                        right--;
                    } else if (target > nums[head] + nums[left] + nums[right] + nums[tail]){
                        left++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSum0018 fourSum0018 = new FourSum0018();
        System.out.println(fourSum0018.fourSum(new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000},1000000000));
//        System.out.println(fourSum0018.fourSum(new int[]{0,4,-5,2,-2,4,2,-1,4},12));
//        System.out.println(fourSum0018.fourSum(new int[]{1,0,-1,0,-2,2},0));
//        System.out.println(fourSum0018.fourSum(new int[]{2,2,2,2,2},8));
//        System.out.println(fourSum0018.fourSum(new int[]{0},0));
//        System.out.println(fourSum0018.fourSum(new int[]{2,1,0,-1},2));
//        System.out.println(fourSum0018.fourSum(new int[]{-2,-1,-1,1,1,2,2},0));
    }
}
