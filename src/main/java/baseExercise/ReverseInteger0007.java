package baseExercise;

/**
 * @author : Jason.ma
 * @date : 2022/5/31 17:23
 */
public class ReverseInteger0007 {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            if (Integer.MAX_VALUE / 10 < result || Integer.MIN_VALUE / 10 > result){
                return 0;
            }
            result = result * 10 + x % 10;
            x = x/10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1));
        System.out.println(reverse(-0));
    }
}
