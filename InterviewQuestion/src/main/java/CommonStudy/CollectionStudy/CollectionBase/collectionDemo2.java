package CommonStudy.CollectionStudy.CollectionBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("Zhangsan", 20);
        Student student2 = new Student("Lisi", 21);
        Student student3 = new Student("Wangwu", 22);
        Collection<Student> coll = new ArrayList<>();
        coll.add(student1);
        coll.add(student2);
        coll.add(student3);
        Iterator<Student> it = coll.iterator();
        boolean flag = it.hasNext();
        String str = it.next().name;
        System.out.println(str);

        //iterator遍历方法
        Iterator<Student> it2 = coll.iterator();
        while(it2.hasNext()){
            String str2 = it2.next().name;
            System.out.println(str2);
        }

        Student s4 = new Student("Zhangsan", 20);
        System.out.println(s4.equals(student1) );
        System.out.println(coll.contains(s4));

    }
}
