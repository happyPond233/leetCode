package baseExercise;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author : Jason.ma
 * @date : 2022/5/30 14:54
 */
public class LongestPalindrome0005 {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1){
            return s;
        }
        int resultHead = 0;
        int resultTail = 0;
        int resultLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i ; j--) {
                //截取字符串会有性能消耗
//                String str = s.substring(i, j);
                if (resultLength > j - i){
                    break;
                }
                int length = judgeIsPalindrome(s,i,j);
                if (length != 0){
                    resultLength = length;
                    resultHead = i;
                    resultTail = j;
                }
            }
        }
        return s.substring(resultHead,resultTail);
    }

    /**
     * 判断 str 是否是回文字符串,如果是回文字符串则返回其长度
     * @param str
     * @return
     */
    public static int judgeIsPalindrome(String str,int left, int right){
        int head = left , tail = right - 1;
        while (head < tail){
            if (str.charAt(head++) != str.charAt(tail--)){
                return 0;
            }
        }
        return right - left;
    }

    public static void main(String[] args) {
        String str1 = "bb";
        String str2 = "cbbd";
        String str3 = "babad";
        System.out.println(longestPalindrome(str1));
        System.out.println(longestPalindrome(str2));
        System.out.println(longestPalindrome(str3));
    }
}
