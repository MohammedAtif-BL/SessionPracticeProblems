package ds;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.
        list.add(2);
        list.add(3);
        list.add(45);
        System.out.println(list);
        list.add(1,23);

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(1,12);

        System.out.println(list);

        System.out.println(list.size());

        list.remove(3);
        System.out.println(list);

        list.indexOf(2);

    }
}
