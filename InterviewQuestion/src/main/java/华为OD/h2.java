package 华为OD;

import java.util.Scanner;

//查找子字符串
//字符串序列判断
public class h2 {
    public static void main(String[] args) {
        //双指针算法
        Scanner sc = new Scanner(System.in);
        Boolean result = false;
        while (sc.hasNextLine()){
            String s1 = sc.nextLine();
            System.out.println("s1 is equal to: " + s1);
            String s2 = sc.nextLine();
            System.out.println("s2 is equal to " + s2);
            if(s1.length() > s2.length()){
                result = false;
            }
            int p1 = 0;
            int p2 = 0;

            while(p1 < s1.length() && p2 < s2.length()){
                if(s1.charAt(p1) == s2.charAt(p2) ){
                    p1++;
                }
                p2++;
            }
            if(p1 == s1.length()){
                result = true;
            }
            System.out.println("result is : " + result);
        }

    }
}
