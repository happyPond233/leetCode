package baseExercise;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : Jason.ma
 * @date : 2022/7/19 11:18
 */
public class LetterCombinationsOfAPhoneNumber0017 {
    public List<String> letterCombinations(String digits) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < digits.length(); i++) {
            String letter = getLetter(digits.charAt(i));
            HashSet<String> newR = new HashSet<>();
            for (int j = 0; j < letter.length(); j++) {
                if (result.isEmpty()){
                    newR.add(String.valueOf(letter.charAt(j)));
                }else {
                    for (String s : result) {
                        newR.add(s + letter.charAt(j));
                    }
                }
            }
            result = newR;
        }
        return result.stream().collect(Collectors.toList());
    }

    private String getLetter(char ch) {
        switch (ch){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
        }
        return null;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber0017 test0017 = new LetterCombinationsOfAPhoneNumber0017();
        System.out.println(test0017.letterCombinations("23"));
        System.out.println(test0017.letterCombinations("2"));
        System.out.println(test0017.letterCombinations(""));
    }
}
