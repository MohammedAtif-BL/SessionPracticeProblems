package LinkedListClass;

import java.util.LinkedList;

public class LinkedListExmaple {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

        linkedList.add(2,"AA");
        System.out.println(linkedList);

        linkedList.addFirst("XYZ");
        linkedList.addLast("ABC");
        System.out.println(linkedList);

        linkedList.remove(4);
        System.out.println(linkedList);

        System.out.println(linkedList.size());

        for (String list : linkedList){
            System.out.print(list+ " ");
        }
    }
}
