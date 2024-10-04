package CommonStudy.CollectionStudy.CollectionBase;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo4 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
