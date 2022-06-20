package baseExercise;

/**
 * @author : Jason.ma
 * @date : 2022/6/20 09:48
 */
public class RomanToInteger0013 {
    public static int romanToInt(String s) {
        int current = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = getRomanToInteger(s.charAt(i));
            if (current < currentValue){
                result += currentValue - 2 * current;
            } else {
                result += currentValue;
            }
            current = currentValue;
        }
        return result;
    }

    private static int getRomanToInteger(char ch) {
        switch (ch){
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
