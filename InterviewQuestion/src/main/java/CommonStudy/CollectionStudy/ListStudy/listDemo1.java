package CommonStudy.CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        //List集合独有的方法
        //1. add(int index, E element)
        //2. remove(int index)
        //3. get(int index)
        //4. set(int index, E element)

        List<String> list = new ArrayList<>();
        list.add("aaa") ;
        list.add("bbb") ;
        list.add("ccc") ;
        list.add("ddd") ;

        list.add(1, "qqq"); //在此集合1索引的位置插入元素，剩下的元素往后移一位

        String remove = list.remove(0);//删除并返回指定索引的元素

        String result = list.set(0, "MMM");

        String getValue = list.get(0);
        System.out.println(getValue);

        System.out.println(remove);
        System.out.println(list);


    }
}
