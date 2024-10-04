package CommonStudy.CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class listDemo3 {
    public static void main(String[] args) {
        /*
        List集合的五种遍历方式
        1. 迭代器方式
        2. 列表迭代器
        3. 增强for
        4. Lambda表达
        5. 普通for
         */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1. 迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //2. 增强for
        //下面的变量str只是第三方的变量表示集合中的每一个元素
        for (String str : list) {
            System.out.println(str);
        }

        //3. Lambda
        //forEach方法底层其实就是一个循环遍历，依次得到集合中的每一个元素
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //3. lambda 缩略版
        list.forEach((String s)->{
            System.out.println(s);
        });

        //4. 普通for
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("普通for"+str);
        }
        //5. 列表迭代器
        //额外添加了一个方法：在遍历的过程中可以添加元素

        ListIterator<String> it2 = list.listIterator();
        System.out.println("列表迭代器演示：");

        while(it2.hasNext()){
            String str = it2.next();
            String toCompare = "aaa";
            if(toCompare.equals(str)){
                it2.add("ccc");
            }

            System.out.println(list);
        }
    }
}
