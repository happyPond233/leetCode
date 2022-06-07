package baseExercise;

/**
 * @author : Jason.ma
 * @date : 2022/6/7 10:34
 */
public class ContainerWithMostWater0011 {

    public static int maxArea(int[] height) {
        int head = 0 , tail = height.length - 1;
        int length = 0;
        int high = 0;
        int result = 0;
        while (head < tail){
            length = tail - head;
            if (height[head] > height[tail]){
                high = height[tail--];
            } else {
                high = height[head++];
            }
            result = high * length > result ? high * length : result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
//        System.out.println();
    }
    
}
