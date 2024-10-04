package InterviewQuestionList;

import java.util.ArrayList;
import java.util.LinkedList;


//Compare LinkedList and ArrayList
public class Q1 {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.get(1);
        arrayList.add(1);//添加到数组的最后一个位置，但是会涉及到扩容
        arrayList.add(1, 1);//添加到数组的指定位置，会涉及到数组的移动，遍历比较快，插入比较慢



        LinkedList linkedList = new LinkedList();
        linkedList.get(1);//查询链表需要遍历这个链表
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.add(1);
        linkedList.add(1, 1); //遍历找到下标然后插入，遍历比较慢， 插入比较快



    }





}
