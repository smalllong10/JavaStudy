package CommonStudy.CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.List;

public class listDemo2 {
    public static void main(String[] args) {
        //List系列集合中的两个删除方法
        //1.直接删除元素
        //2. 通过索引进行删除

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.remove(1);
        //在使用list中remove方法，如果方法出现了重载现象
        //***关键
        //优先调用实际参数和形参一致的那个方法
        //***
        //list可以调用的第一个remove方法形参是Object o，而int需要转换成Object需要额外的步骤
        //而如果这个Integer是代表索引，则不需要额外的步骤，直接就是Integer
        //所以如果Integer的List直接输入数字来remove，则优先调用为Index的参数
        System.out.println(list1);

        //如果一定想要删除指定的元素，在出现了方法重载现象的情况下
        //可以手动装箱，手动把基本数据类型1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list1.remove(i);
        System.out.println(list1);

    }
}
