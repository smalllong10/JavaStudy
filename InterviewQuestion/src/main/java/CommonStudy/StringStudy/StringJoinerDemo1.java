package CommonStudy.StringStudy;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1. 创建元素
        StringJoiner sj = new StringJoiner(", ");
        //or
        StringJoiner sj2 = new StringJoiner(",", "[", "]");

        //2. 添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //3. 获取长度
        int len = sj.length();
        System.out.println(len);

        //4. 打印
        System.out.println(sj);


    }
}
