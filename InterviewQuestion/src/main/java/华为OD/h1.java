package 华为OD;

import java.util.Locale;
import java.util.Scanner;

//字符串分割：
public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int k = Integer.parseInt(sc.nextLine());
            String[] strings = sc.nextLine().split("-");
            String s = "";
            for(int i = 1; i < strings.length; i++){
                s = s + strings[i];
            }
            int index = 0;
            StringBuffer buffer = new StringBuffer();
            //StringBuffer的使用？
            buffer.append(strings[0]);
            while (s.length() - index > k) {//判断现在字符串的位置还超过需要分割的数量
                buffer.append("-" + caseConversion(s.substring(index, index + k)) );
                index += k;//每次循环增加分割的数量k

            }
            if(s.length() - index > 0 ){//分割完成后判断是否还有剩余
                buffer.append("-" + caseConversion(s.substring(index)));//把剩余添加的buffer里面

            }
            System.out.println("sample result"+ buffer);
        }
    }
    private static String caseConversion(String s ){
        String test = s.replaceAll("[A-Z]", "");
        System.out.println("Test for Upper case is \n"+test);
        String test2 = s.replaceAll("[a-z]", "");
        System.out.println("Test for Lower case is \n"+ test2 );
        //总长度 - 去掉大写字母的长度（字符串中去掉大写字母就只剩下小写字母，所以剪掉小写字母的长度就是大写字母的长度） = 大写字母的长度
        int upperCaseLength = s.length() - s.replaceAll("[A-Z]", "").length();
        //总长度 - 去掉小写字母的长度 = 小写字母的长度
        int lowerCaseLength = s.length() - s.replaceAll("[a-z]", "").length();
        if(upperCaseLength > lowerCaseLength){
            return s.toUpperCase(Locale.ROOT);
        }
        if(lowerCaseLength > upperCaseLength){
            return s.toLowerCase(Locale.ROOT);
        }
        return s;
    }
}
