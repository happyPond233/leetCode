package baseExercise;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的  最长子串  的长度。
 *
 *   
 *
 * 示例  1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是  "wke"，所以其长度为 3。
 *       请注意，你的答案必须是 子串 的长度，"pwke"  是一个子序列，不是子串。
 *   
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s  由英文字母、数字、符号和空格组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @author : Jason.ma
 * @date : 2022/5/27 16:35
 */
public class LengthOfLongestSubstring0003 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1){
            return s.length();
        }
        //ASCII码有128个
        int[] map = new int[128];
        int result = 1;
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }

        for (int i = 0,head = 0; i < s.length(); i++) {
            if (map[s.charAt(i)] >= 0 && head <= map[s.charAt(i)] + 1){
                head = map[s.charAt(i)] + 1;
            }
            if (i - head + 1 > result){
                result = i - head + 1;
            }

            map[s.charAt(i)] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "pwwkew";
        String s3 = "abcabcbb";
        String s4 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
    }
}
