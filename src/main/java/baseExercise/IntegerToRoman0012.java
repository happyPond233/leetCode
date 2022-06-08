package baseExercise;

/**
 * @author : Jason.ma
 * @date : 2022/6/8 10:34
 */
public class IntegerToRoman0012 {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        //处理千位数
        int thousandNum = num / 1000;
        for (int i = thousandNum; i > 0; i--) {
            sb.append("M");
        }
        num = num % 1000;
        int hundredNum = num / 100;
        if (hundredNum == 9){
            sb.append("CM");
        } else if (hundredNum >= 5){
            sb.append("D");
            for (int i = hundredNum - 5; i > 0; i--) {
                sb.append("C");
            }
        }else if (hundredNum == 4){
            sb.append("CD");
        } else {
            for (int i = hundredNum; i > 0; i--) {
                sb.append("C");
            }
        }
        //处理百位数
        num = num % 100;
        int tenNum = num / 10;
        if (tenNum == 9){
            sb.append("XC");
        } else if (tenNum >= 5){
            sb.append("L");
            for (int i = tenNum - 5; i > 0; i--) {
                sb.append("X");
            }
        } else if (tenNum == 4){
            sb.append("XL");
        } else {
            for (int i = tenNum; i > 0; i--) {
                sb.append("X");
            }
        }
        //处理个位数
        num = num % 10;
        int singleNum = num;
        if (singleNum == 9){
            sb.append("IX");
        } else if (singleNum >= 5){
            sb.append("V");
            for (int i = singleNum - 5; i > 0; i--) {
                sb.append("I");
            }
        } else if (singleNum == 4){
            sb.append("IV");
        } else {
            for (int i = singleNum; i > 0; i--) {
                sb.append("I");
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
//        System.out.println(intToRoman(3999));
        System.out.println(intToRoman(60));
    }
}
