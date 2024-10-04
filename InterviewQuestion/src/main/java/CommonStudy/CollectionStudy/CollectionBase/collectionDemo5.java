package CommonStudy.CollectionStudy.CollectionBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class collectionDemo5 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("xiaohuolong");
        coll.add("jienigui");
        coll.add("miaowazhongzi");
        //forEach源码需要创建consumer
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s -> System.out.println(s));
    }
}
