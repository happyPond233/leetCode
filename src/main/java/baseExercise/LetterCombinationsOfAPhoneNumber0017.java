package baseExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Jason.ma
 * @date : 2022/7/19 11:18
 */
public class LetterCombinationsOfAPhoneNumber0017 {
    public List<String> letterCombinations(String digits) {
        String[] strings = new String[digits.length()];
        int size = 1;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = getLetter(digits.charAt(i));
            size = size * strings[i].length();
        }
        String[] result = new String[size];

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];

        }
        return null;
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
        test0017.letterCombinations("23");
    }
}
