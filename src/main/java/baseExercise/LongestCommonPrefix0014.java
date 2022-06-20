package baseExercise;

import java.util.Arrays;

/**
 * @author : Jason.ma
 * @date : 2022/6/20 10:49
 */
public class LongestCommonPrefix0014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (result == ""){
                return "";
            }
            result = getLogestCommoinPrefix(result,strs[i]);
        }
        return result;
    }

    private static String getLogestCommoinPrefix(String aStr, String str) {
        int resultLength = 0;
        while (resultLength < Math.min(aStr.length(),str.length())){
            if (aStr.charAt(resultLength) != str.charAt(resultLength)){
                break;
            }
            resultLength++;
        }
        return aStr.substring(0,resultLength);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
