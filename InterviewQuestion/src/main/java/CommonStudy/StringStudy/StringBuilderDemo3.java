package CommonStudy.StringStudy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBuilderDemo3 {

    //使用StringBuilder的场景
    //1. 字符串的拼接
    //2. 字符串的反转
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();
        String result = new StringBuilder().append(str).reverse().toString();

        if(str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串是对称字符串");
        }

    }
}
