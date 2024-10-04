package CommonStudy.CollectionStudy.CollectionBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo3 {
    public static void main(String[] args) {
        //Collection的三种遍历方式：
        //1. 迭代器遍历
        //2. 增强for表达式
        //3. lambda表达式遍历

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2. 获取迭代器对象
        //迭代器默认指向集合的0索引
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            //next方法做了两件事情：获取元素，然后移动指针
            String str = it.next();
            System.out.println(str);
        }
        //迭代器的细节
        //1. 报错NoSuchElementException: 如果循环到最后一个元素但是还是继续使用next方法，就会返回错误
        //2. 迭代器遍历完毕，指针不会复位
        //3. 循环中只能使用一次next方法
        //4. 迭代器遍历过程中，不能使用集合的方法进行增加或者删除:如果在使用迭代器的时候调用集合的方法增加或者删除，就会返回ConcurrentModificationException
        //如果一定要在迭代器中删除，可以使用迭代器提供的remove方法来进行删除
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            if("bbb".equals(str)) {
                it2.remove();
            }
        }

        System.out.println(coll);

    }
}
