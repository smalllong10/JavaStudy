package CommonStudy.CollectionStudy.CollectionBase;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo1 {
    public static void main(String[] args) {
        //Collection的方法
        Collection<String> coll = new ArrayList<>();

        //1.boolean add()
        //在List集合中，返回值一定为true。因为List中的值是可以重复的
        //在Set集合中，因为插入的值不能重复，如果Set当中没有这个数，则成功插入返回true
        //如果Set当中有这个数，则插入失败返回false
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2. boolean remove()
        //如果集合中存在这个数值，则删除这个数值并返回true
        //如果集合当中不存在这个数值，则删除失败返回false
        coll.remove("aaa");
        System.out.println(coll);

        //3. void clear();
        coll.clear();
        System.out.println(coll);

        //4. boolean contains()
        //细节：底层是通过equals()方法进行判断是否存在的
        //所以，如果集合当中储存的是自定义对象，也想通过contains判断是否包含，那么在javabean类中，一定要重写equals方法
        coll.add("abc");
        System.out.println(coll.contains("abc"));

        //5. isEmpty();
        System.out.println(coll.isEmpty());
    }
}
