package CommonStudy.StringStudy;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        if(str == null || str.length() > 9){
            System.out.println("字符串的长度不可以大于9");
        }

        String[] romanChar = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        System.out.println('0' + 0);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(current >= '0' && current <= '9'){
//              str.replace(current, romanChar[current - '0']);
                sb.append(romanChar[current - '0']);
            }
        }
        System.out.println(sb.toString());
    }
}
